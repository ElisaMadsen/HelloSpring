package com.example.springintroduction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class IndexControllers {
    @GetMapping("/friendlymessage")
    public String friendlyMessage() {
        return "A Friendly Message";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    @GetMapping("/erdetfredag")
    public String isItFriday() {
        LocalDate date = LocalDate.now();

        if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return "It's Friday!😍";
        } else {
            return "It's Not Friday😪";
        }
    }
}


