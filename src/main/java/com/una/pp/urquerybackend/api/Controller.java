package com.una.pp.urquerybackend.api;

import com.una.pp.urquerybackend.services.ServiceApp;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.IOException;

@RequestMapping("api/una")
@RestController
public class Controller {

    @GetMapping(path = "/about")
    public JSONObject about() throws IOException, ParseException {  //despliega un json con la informacion de los integrantes
        return ServiceApp.instance().about();
    }

    @RequestMapping(value = "document/{DDDD}")
    public String search(@PathVariable String DDDD) {
        return ServiceApp.instance().search(DDDD);
    }
}
