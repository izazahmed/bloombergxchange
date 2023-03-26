package com.slb.apigee.xchange.client;

import java.util.List;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Value;

import com.bloomberg.services.datalicense.dlws.ps._20071001.BvalFieldSets;
import com.bloomberg.services.datalicense.dlws.ps._20071001.Fields;
import com.bloomberg.services.datalicense.dlws.ps._20071001.GetDataHeaders;
import com.bloomberg.services.datalicense.dlws.ps._20071001.Instrument;
import com.bloomberg.services.datalicense.dlws.ps._20071001.Instruments;
import com.bloomberg.services.datalicense.dlws.ps._20071001.MarketSector;
import com.bloomberg.services.datalicense.dlws.ps._20071001.Override;
import com.bloomberg.services.datalicense.dlws.ps._20071001.Overrides;
import com.bloomberg.services.datalicense.dlws.ps._20071001.ProgramFlag;
import com.bloomberg.services.datalicense.dlws.ps._20071001.ResponseStatus;
import com.slb.apigee.xchange.entity.Currency;

public class BloombergServiceRequest {

	@Value("${bloomberg.cman.usernumber}")
	private int usernumber;
	
	// @WebParam(name = "headers", targetNamespace =
	// "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private GetDataHeaders headers = new GetDataHeaders();
	

	// @WebParam(name = "fieldsets", targetNamespace =
	// "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private BvalFieldSets fieldsets = new BvalFieldSets();

	// @WebParam(name = "fields", targetNamespace =
	// "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private Fields fields = new Fields();

	// @WebParam(name = "instruments", targetNamespace =
	// "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private Instruments instruments = new Instruments();

	// @WebParam(mode = WebParam.Mode.OUT, name = "statusCode", targetNamespace
	// = "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private Holder<ResponseStatus> statusCode = new Holder<ResponseStatus>();

	// @WebParam(mode = WebParam.Mode.OUT, name = "requestId", targetNamespace =
	// "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private Holder<String> requestId = new Holder<String>();

	// @WebParam(mode = WebParam.Mode.OUT, name = "responseId", targetNamespace
	// = "http://services.bloomberg.com/datalicense/dlws/ps/20071001")
	private Holder<String> responseId = new Holder<String>();

	public BloombergServiceRequest(List<Currency> currencyList, Integer usernumber,String type) {
		headers.setSecmaster(true);
		headers.setPricing(true);
		headers.setProgramflag(ProgramFlag.ADHOC);
		if(usernumber!=null)
			headers.setUsernumber(usernumber);
		if(type.equals("Equity"))
			headers.setFundamentals(Boolean.TRUE);
		
		fields.getField().add("NAME");//1
		fields.getField().add("TICKER");//2
		fields.getField().add("ID_BB_GLOBAL");//3
		fields.getField().add("SECURITY_TYP");//4
		fields.getField().add("PX_MID");//5
		fields.getField().add("PX_LAST");//6
		fields.getField().add("PX_ASK");//7
		fields.getField().add("PX_BID");//8
		fields.getField().add("PX_HIGH");//9
		fields.getField().add("PX_LOW");//10
		fields.getField().add("LAST_UPDATE");//11
		fields.getField().add("LAST_UPDATE_DT");//12
		fields.getField().add("QUOTE_FACTOR");//13
		fields.getField().add("PRICING_SOURCE");//14
		fields.getField().add("FX_PRICING_SOURCE");//15
		fields.getField().add("BS_TIER1_CAP_RATIO");//16

    /*    <ns:overrides>
        <ns:override>
            <ns:field>FWD_CURVE_QUOTE_FORMAT</ns:field>
            <ns:value>POINTS</ns:value>
        </ns:override>
    </ns:overrides>*/

		Overrides overridesFWD_CURVE_QUOTE_FORMAT= new Overrides();
		Override override= new Override();	
		override.setField("FWD_CURVE_QUOTE_FORMAT");
		override.setValue("POINTS");
		overridesFWD_CURVE_QUOTE_FORMAT.getOverride().add(override);
		
		Overrides overridesForFundPer= new Overrides();
		Override overridefundPer= new Override();	
		overridefundPer.setField("FUND_PER");
		overridefundPer.setValue("S");
		overridesForFundPer.getOverride().add(overridefundPer);
		
		for (int i = 0; i < currencyList.size(); i++) {
			Instrument instrument = new Instrument();
			 
			instrument.setId(currencyList.get(i).getCurrency());
			
			//For Comdty , YellowKey should set to Comdty Ex:  CO1 Comdty
			if(currencyList.get(i).getCurrency().endsWith("Comdty")){
				//As Comdty is already there along with ticker no need add Comdty as
				//yellow key
				//instrument.setYellowkey(MarketSector.COMDTY);	
			}else if(currencyList.get(i).getCurrency().endsWith("Equity")){
				/*<ns:overrides>												
		            <ns:override>												
		                <ns:field>FUND_PER</ns:field>												
		                <ns:value>S</ns:value>												
		            </ns:override>												
		        </ns:overrides> */
				instrument.setOverrides(overridesForFundPer);				
				
			}else{
				instrument.setYellowkey(MarketSector.CURNCY);			
				instrument.setOverrides(overridesFWD_CURVE_QUOTE_FORMAT);
			}
			
			instruments.getInstrument().add(instrument);
		}

	}

	public GetDataHeaders getHeaders() {
		return headers;
	}

	public BvalFieldSets getFieldsets() {
		// return fieldsets;
		return null;
	}

	public Fields getFields() {
		return fields;
	}

	public Instruments getInstruments() {
		return instruments;
	}

	public Holder<ResponseStatus> getStatusCode() {
		return statusCode;
	}

	public Holder<String> getRequestId() {
		return requestId;
	}

	public Holder<String> getResponseId() {
		return responseId;
	}
}
