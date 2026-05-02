package com.example.demo.controller;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://demos-ptb5.vercel.app")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return LocalTime.now().toString();
    }

    @GetMapping("/tasks")
    public int[] getMethodName() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new int[] { LocalTime.now().getMinute() / 2, LocalTime.now().getMinute() / 3,
                LocalTime.now().getMinute() / 4 };
    }

    @GetMapping("/time")
    public String getTime() {
         try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Server time: " + new Date();
    }
}
