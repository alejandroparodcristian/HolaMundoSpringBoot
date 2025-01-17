package com.example.ejemploholamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @GetMapping("HolaMundo")
    public String holaMundo() {
        return "Hola Mundo";
    }
}
