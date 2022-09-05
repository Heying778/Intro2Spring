package com.example.task_01.controllers;
import com.example.task_01.models.Celebration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/games")
public class Controller {

    @GetMapping
    public String Greeting(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }

    @GetMapping(value = "/christmas")
    public Celebration newCelebration() {
        return new Celebration("Merry Christmas!");
    }

}
