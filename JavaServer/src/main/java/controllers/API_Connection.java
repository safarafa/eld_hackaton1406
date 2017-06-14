package controllers;

import domain.Temperature;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Bogusia on 14.06.2017.
 */
public class API_Connection {

    public void connect(String fileName) throws IOException{
        Scanner input = new Scanner(new File(fileName));
        Temperature temperature = new Temperature(input.nextInt());

    }
}
