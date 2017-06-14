package service;


import domain.Temperature;

public class TemperatureService {
     void increment(){
         if(Temperature.getValue()<=Temperature.maxvalue && Temperature.getValue()>Temperature.minvalue)
         {
             Temperature.setValue(Temperature.getValue()+1);
         }


     }

     void decrement(){

     }
}
