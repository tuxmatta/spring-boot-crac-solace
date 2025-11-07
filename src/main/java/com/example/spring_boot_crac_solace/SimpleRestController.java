package com.example.spring_boot_crac_solace;

import org.springframework.context.Lifecycle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SimpleRestController implements Lifecycle {
    private boolean running = false;

    @GetMapping
    public Iterable findAll() {
        return List.of(true, false);
    }

    @Override
    public void start() {
        System.out.println("Starting SimpleRestController");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("Stopping SimpleRestController");
        running = false;
    }

    @Override
    public boolean isRunning() {
        System.out.println("isRunning SimpleRestController: " + running);
        return false;
    }
}
