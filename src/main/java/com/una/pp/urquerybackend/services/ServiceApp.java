package com.una.pp.urquerybackend.services;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ServiceApp {

    private static ServiceApp uniqueInstance;

    public static ServiceApp instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServiceApp();
        }
        return uniqueInstance;
    }
    public JSONObject about() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("src\\main\\java\\com\\una\\pp\\urquerybackend\\data\\group.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        return pJsonObj;
    }

}
