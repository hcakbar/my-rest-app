package com.myrestapp.org.myrestapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akbar on 9/30/2017.
 */


@RestController
public class HealthController {

    @RequestMapping("/health")
    public String getHealth() {
        return "IT'S UP! Ayo Rama :)";
    }


}
