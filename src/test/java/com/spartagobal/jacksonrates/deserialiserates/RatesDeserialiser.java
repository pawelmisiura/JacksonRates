package com.spartagobal.jacksonrates.deserialiserates;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesDeserialiser {
    public RatesDTO ratesMapped;

    public RatesDeserialiser(String fileLocation) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ratesMapped = objectMapper.readValue(new FileReader(fileLocation), RatesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
