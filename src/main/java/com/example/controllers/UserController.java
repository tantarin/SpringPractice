package com.example.controllers;


import com.example.entities.FruitEntity;
import com.example.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private FruitService fruitService;

    @GetMapping(value = "/signup", produces = "application/json")
    public ResponseEntity<List<FruitEntity>> findAll() {
        return new ResponseEntity<>(fruitService.getAll(), HttpStatus.OK);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}