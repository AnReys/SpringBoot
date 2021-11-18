package edu.ntudp.sau.reis.javaspringbootlab.controllers;

import java.util.Random;

public class NumberCreator {
    String createRandomNumber(){
        Random random = new Random();
        return " My increadable random number = "+ random.nextInt(100);
    }
}
