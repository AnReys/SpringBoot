package edu.ntudp.sau.reis.javaspringbootlab.controllers;

import java.util.Random;

public class NumberCreator {
    String createRandomNumber(){
        Random random = new Random();
        return " "+ random.nextInt(100);
    }
}
