package service;

import domain.Temperature;
import exceptions.InvalidTemperatureException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bogusia on 14.06.2017.
 */
public class TemperatureServiceTest {

    TemperatureService temperatureService = new TemperatureService();

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldThrowExceptionWhenTemperatureIsTooSmall(){
        Temperature.setValue(50);
        exception.expect(InvalidTemperatureException.class);
        exception.expectMessage("Invalid temperature");

        temperatureService.increment();

    }

    @Test
    public void shouldThrowExceptionWhenTemperatureIsTooBig(){
        Temperature.setValue(0);
        exception.expect(InvalidTemperatureException.class);
        exception.expectMessage("Invalid temperature");

        temperatureService.decrement();

    }

    @Test
    public void shouldReturnValidTemperature(){
        Temperature.setValue(21);
        int temp = temperatureService.showTemperature();

        assertEquals(21, temp);
    }
}
