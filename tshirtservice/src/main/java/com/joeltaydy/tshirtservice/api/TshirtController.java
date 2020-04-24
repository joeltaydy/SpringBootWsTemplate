package com.joeltaydy.tshirtservice.api;

import java.util.HashMap;
import java.util.Map;

import com.joeltaydy.tshirtservice.model.Tshirt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
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

    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping(value = "/tshirts")
    public ResponseEntity<Object> getTshirt() {
        return new ResponseEntity<>(tshirtRepo.values(), HttpStatus.OK);
    }

    @PostMapping(value = "/tshirts")
    @ResponseStatus(HttpStatus.CREATED) // 201
    public ResponseEntity<Object> createProduct(@RequestBody Tshirt product) {
        tshirtRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

}