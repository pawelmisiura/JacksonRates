package com.spartagobal.tests;

import com.spartagobal.HTTPServices.FixerLatestHTTPService;
import com.spartagobal.JSONParser.RatesDeserialiser;
import com.spartagobal.RatesMethods;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RatesTests {

    private static RatesDeserialiser rates;
    private static FixerLatestHTTPService fixerLatestHTTPService = new FixerLatestHTTPService();


    @BeforeClass
    public static void setup(){
        fixerLatestHTTPService.executeLatestRatesGetRequests();
        rates = new RatesDeserialiser(fixerLatestHTTPService.getFixerLatestRatesJSONString());

    }

    @Test
    public void testSuccessIsTrue(){
        Assert.assertTrue(rates.ratesMapped.success);
    }

//    @Test
//    public void testIfTimestampIsConvertingCorrectly(){
//        RatesMethods ratesMethods = new RatesMethods();
//        String testDate = "10/10/2018 14:44:06";
//        Assert.assertEquals(testDate, ratesMethods.getNormalTimestampFromEpoch());
//    }
//
//    @Test
//    public void testRatesCount(){
//        RatesMethods ratesMethods = new RatesMethods();
//        int testRateData = 168;
//        Assert.assertEquals(testRateData, ratesMethods.getNumberOfRates());
//    }
}
