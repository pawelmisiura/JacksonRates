package com.spartagobal;

import com.spartagobal.JSONParser.RatesDeserialiser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class RatesMethods  {
    private static RatesDeserialiser rates = new RatesDeserialiser("resources/rates.json");


    public String getNormalTimestampFromEpoch(){
        Date date = new Date(rates.ratesMapped.getTimestamp() * 1000);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT/UTC"));
        String formatted = format.format(date);
        return formatted;
    }

    public int getNumberOfRates(){
        int ratesCount = rates.ratesMapped.getRates().size();
        return ratesCount;
    }
}
