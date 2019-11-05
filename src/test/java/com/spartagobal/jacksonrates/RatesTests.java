package com.spartagobal.jacksonrates;

import com.spartagobal.jacksonrates.deserialiserates.RatesDeserialiser;
import com.spartagobal.jacksonrates.deserialiserates.RatesMethods;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RatesTests {

    private static RatesDeserialiser rates;
    RatesMethods ratesMethods = new RatesMethods();

    @BeforeClass
    public static void setup(){
        rates = new RatesDeserialiser("resources/rates.json");
    }

    @Test
    public void testSuccessIsTrue(){
        Assert.assertTrue(rates.ratesMapped.success);
    }

    @Test
    public void testIfTimestampIsConvertingCorrectly(){
        String testDate = "10/10/2018 14:44:06";
        Assert.assertEquals(testDate, ratesMethods.getNormalTimestampFromEpoch());
    }

    @Test
    public void testRatesCount(){
        int testRateData = 168;
        Assert.assertEquals(testRateData, ratesMethods.getNumberOfRates());
    }
}
