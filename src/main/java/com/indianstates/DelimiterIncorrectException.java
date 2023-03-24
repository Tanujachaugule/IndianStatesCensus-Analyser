package com.indianstates;

public class DelimiterIncorrectException extends RuntimeException{
    @Override
    public String toString() {
        return "comma seperator is not proper in CSV file";
    }
}
