package controllers;


import cors.Cors;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CorsController {
    private static final String template = "Celcjusza, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:8080")     //"http://localhost:9000"
    //@ComponentScan(basePackageClasses=Cors.class)
    @GetMapping("/cors")
    public Cors greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        //System.out.println("==== in greeting ====");
        return new Cors(counter.incrementAndGet(), String.format(template, name));
    }
}
