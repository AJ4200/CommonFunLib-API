package com.jeproductions.commonfunlibapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeproductions.commonfunlibapi.Lib.Generator;
import com.jeproductions.commonfunlibapi.Models.GeneratorModel;

@RestController


public class GeneratorController {
    Generator gen = new Generator();
    String password = "";

    @GetMapping("/generatePassword")
    public GeneratorModel generatePassword(@RequestParam("length") int length) {
        password = gen.generatePassword(length);
        return new GeneratorModel(password);
    }

    @GetMapping("/generateRandomName")
    public GeneratorModel generateRandomName() {
        String randomName = gen.generateRandomName();
        return new GeneratorModel(randomName);
    }

    @GetMapping("/generateRandomNumber")
    public GeneratorModel generateRandomNumber(@RequestParam("min") int minValue, @RequestParam("max") int maxValue) {
        int randomNumber = gen.generateRandomNumber(minValue, maxValue);
        return new GeneratorModel(Integer.toString(randomNumber));
    }
}