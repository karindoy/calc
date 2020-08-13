package com.calc.calcrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping(path = "/")
    public String hi() {
        return " Hello the API is working! <br> " +
                "Access hi page in http://localhost:3637/ <br>" +
                "Access getn page in http://localhost:3637/getn <br>" +
                "Access calc page in http://localhost:3637/calc?n1=3&n2=6, " +
                "you can change values of n1 and n2 to test";
    }

    @GetMapping(path = "/calc")
    public int sum(@RequestParam int n1, @RequestParam int n2) {
        System.out.println("Received" +n1+ " and " + n2);
        return (n1 + n2);
    }

    @GetMapping(path = "/getn")
    public int getN() {
        return 5;
    }

}

