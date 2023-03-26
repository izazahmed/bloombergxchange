package com.slb.apigee.xchange.client;

import com.bloomberg.services.datalicense.dlws.ps._20071001.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static javax.xml.datatype.DatatypeFactory.newInstance;

public class BloombergHistoryRequest {

    private GetHistoryHeaders headers = new GetHistoryHeaders();

    private Fields fields = new Fields();

    private Instruments instruments = new Instruments();

    private Holder<ResponseStatus> statusCode = new Holder<ResponseStatus>();

    private Holder<String> requestId = new Holder<String>();

    private Holder<String> responseId = new Holder<String>();

    public BloombergHistoryRequest() {
    }



    public void setHistoryHeaders(Date inputStartDate,Date inputEndDate) {

        try {
            Period period = new Period();
            DateRange dateRange = new DateRange();
            dateRange.setPeriod(period);
            //Start Date
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTime(inputStartDate);
            XMLGregorianCalendar startDate = newInstance()
                    .newXMLGregorianCalendar(
                            gregory);
            //End Date
            GregorianCalendar gregory1 = new GregorianCalendar();
            gregory1.setTime(inputEndDate);

            XMLGregorianCalendar endDate = newInstance()
                    .newXMLGregorianCalendar(
                    		gregory1);

             

            period.setStart(startDate);
            period.setEnd(endDate);
            dateRange.setPeriod(period);

            headers.setDaterange(dateRange);

        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

    }

    public void setFields() {
/*        fields.getField().add("NAME");
        fields.getField().add("TICKER");
        fields.getField().add("ID_BB_GLOBAL");
        fields.getField().add("SECURITY_TYP");*/
        fields.getField().add("PX_MID");
        fields.getField().add("PX_LAST");
        fields.getField().add("PX_ASK");
        fields.getField().add("PX_BID");
        fields.getField().add("PX_HIGH");
        fields.getField().add("PX_LOW");
/*        fields.getField().add("LAST_UPDATE");
        fields.getField().add("LAST_UPDATE_DT");
        fields.getField().add("QUOTE_FACTOR");
        fields.getField().add("PRICING_SOURCE");
        fields.getField().add("FX_PRICING_SOURCE");*/
    }

    public void setInstruments(List<String> tickerSymbols) {

    	for (String tickerSymbol : tickerSymbols) {
    		Instrument instrument = new Instrument();
            instrument.setId(tickerSymbol);
            instrument.setYellowkey(MarketSector.CURNCY);
            instruments.getInstrument().add(instrument);
		}
        
    }

    public GetHistoryHeaders getHeaders() {
        return headers;
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
