package com.slb.apigee.xchange.client;

 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.FaultOutInterceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bloomberg.services.datalicense.dlws.ps._20071001.PerSecurityWS;
import com.bloomberg.services.datalicense.dlws.ps._20071001.PerSecurityWS_Service;
import com.slb.apigee.xchange.BloombergXchangeSchedulerApplication;

@Component
public class BloombergSoapService {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	protected KeyManager[] getKeyManagers(KeyStore keyStore, String keyPassword)
			throws GeneralSecurityException, IOException {
		String alg = KeyManagerFactory.getDefaultAlgorithm();
		char[] keyPass = keyPassword != null ? keyPassword.toCharArray() : null;
		KeyManagerFactory fac = KeyManagerFactory.getInstance(alg);
		fac.init(keyStore, keyPass);
		return fac.getKeyManagers();
	}

	protected PerSecurityWS getPerSecurityWS() {
		PerSecurityWS_Service service = null;
		try {
			service = new PerSecurityWS_Service();
		} catch (Exception e) {
			e.printStackTrace();
		}
		PerSecurityWS port = null;
		try {
			port = service.getPerSecurityWSPort();
			// setupTLS(port);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Client cxfClient = ClientProxy.getClient(port);
		cxfClient.getInInterceptors().add(new LoggingInInterceptor());
		cxfClient.getOutInterceptors().add(new LoggingOutInterceptor());
		cxfClient.getOutFaultInterceptors().add(new FaultOutInterceptor());

		HTTPConduit httpConduit = (HTTPConduit) cxfClient.getConduit();

		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();

		httpClientPolicy.setConnectionTimeout(36000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(32000);
		httpClientPolicy.setContentType("application/xml;charset=utf-8");
		httpClientPolicy.setAcceptEncoding("gzip,deflate");
		httpConduit.setClient(httpClientPolicy);

		// Keystore setting
		try {

			final TLSClientParameters tlsCP = new TLSClientParameters();
			File p12File = new File(BloombergXchangeSchedulerApplication.P12FILEPATH);
			if(!p12File.exists()){
				LOG.error("$$$$$ p12 security file DLWSCert.p12 didn't found on the path {} ", p12File.getAbsolutePath());
				throw new FileNotFoundException();
			}
			KeyStore.Builder builder = KeyStore.Builder.newInstance("PKCS12", null, p12File,
					new KeyStore.PasswordProtection(BloombergXchangeSchedulerApplication.P12PWD.toCharArray()));
			KeyStore keyStore = builder.getKeyStore();
			String keyPassword = BloombergXchangeSchedulerApplication.P12PWD;
			final KeyManager[] myKeyManagers = getKeyManagers(keyStore, keyPassword);
			tlsCP.setKeyManagers(myKeyManagers);

			httpConduit.setTlsClientParameters(tlsCP);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return port;
	}

}
