package com.spartagobal.HTTPServices;

import com.spartagobal.config.APIKey;
import com.spartagobal.config.FixerURLConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class FixerLatestHTTPService {
    private CloseableHttpResponse fixerResponse;
    private String fixerLatestRatesJSONString;

    public void executeLatestRatesGetRequests(){
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        String latestServiceUrl  = FixerURLConfig.BASEURL + FixerURLConfig.LATESTRATESENDPOINTS + "?" + APIKey.APIKEY;
        HttpGet httpGet = new HttpGet(latestServiceUrl);
        try {
            fixerResponse = closeableHttpClient.execute(httpGet);
            fixerLatestRatesJSONString = EntityUtils.toString(fixerResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFixerLatestRatesJSONString() {
        return fixerLatestRatesJSONString;
    }

    public CloseableHttpResponse getFixerResponse(){
        return fixerResponse;
    }
}

