package controllers;

import domain.Temperature;
import exceptions.InvalidTemperatureException;
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
    public void getTemperature ()
    {
        temperatureService.showTemperature();
    }

    @PostMapping("/increment")
    public void increment(){
        temperatureService.increment();

    }

    @PostMapping("/decrement")
    public void decrement(){
        temperatureService.decrement();
    }

}
