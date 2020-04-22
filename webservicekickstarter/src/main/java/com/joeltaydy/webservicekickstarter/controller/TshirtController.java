package com.joeltaydy.webservicekickstarter.controller;

import java.util.HashMap;
import java.util.Map;

import com.joeltaydy.webservicekickstarter.model.Tshirt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public class TshirtController {
    private static Map<String, Tshirt> tshirtRepo = new HashMap<>();
    static {
        Tshirt fila = new Tshirt();
        fila.setId("1");
        fila.setName("Fila");
        tshirtRepo.put(fila.getId(), fila);

        Tshirt nike = new Tshirt();
        nike.setId("2");
        nike.setName("Nike");
        tshirtRepo.put(nike.getId(), nike);
    }

    @RequestMapping(value = "/Tshirts")
    public ResponseEntity<Object> getTshirt() {
        return new ResponseEntity<>(tshirtRepo.values(), HttpStatus.OK);
    }
}