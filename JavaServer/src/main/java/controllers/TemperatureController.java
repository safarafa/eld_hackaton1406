package controllers;

import domain.Temperature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TemperatureService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
    private TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping
    public void getTemperature()
    {

    }

    @PostMapping("/increment")
    public void increment(){


    }

    @PostMapping
    public void decrement(){

    }

}
