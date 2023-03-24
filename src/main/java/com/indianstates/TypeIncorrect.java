package com.indianstates;

public class TypeIncorrect extends NumberFormatException{
    @Override
    public String toString() {
        return "Incorrect type in CSV file";
    }
}
