package service;


import domain.Temperature;
import exceptions.InvalidTemperatureExceptions;

public class TemperatureService{
     public void increment()throws InvalidTemperatureExceptions{
         if(Temperature.getValue()+1<=Temperature.maxvalue)
         {
             Temperature.setValue(Temperature.getValue()+1);
         }
        else throw new InvalidTemperatureExceptions("Invalid temperature");


     }

     public void decrement() throws InvalidTemperatureExceptions{
         if(Temperature.getValue()-1>=Temperature.minvalue)
         {
             Temperature.setValue(Temperature.getValue()-1);
         }
         else throw new InvalidTemperatureExceptions("Invalid temperature");

     }
}
