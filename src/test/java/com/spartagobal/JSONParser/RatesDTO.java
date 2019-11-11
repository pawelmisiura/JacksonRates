package com.spartagobal.JSONParser;

import java.util.Map;

public class RatesDTO {
    public boolean success;
    private long timestamp;
    private String base;
    private String date;
    private Map<String, Double> rates;

    public boolean isSuccess() {
        return success;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }


}