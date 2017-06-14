package service;


import domain.Temperature;
import exceptions.InvalidTemperatureException;

public class TemperatureService{
     public void increment()throws InvalidTemperatureException{
         if(Temperature.getValue()+1<=Temperature.MAXVALUE)
         {
             Temperature.setValue(Temperature.getValue()+1);
         }
        else throw new InvalidTemperatureException("Invalid temperature");

     }

     public void decrement() throws InvalidTemperatureException{
         if(Temperature.getValue()-1>=Temperature.MINVALUE)
         {
             Temperature.setValue(Temperature.getValue()-1);
         }
         else throw new InvalidTemperatureException("Invalid temperature");

     }

    public int showTemperature() {
         return Temperature.getValue();
    }
}
