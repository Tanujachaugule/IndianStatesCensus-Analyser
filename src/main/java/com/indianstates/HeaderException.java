package com.indianstates;

public class HeaderException extends RuntimeException{
    @Override
    public String toString() {
        return "Header format not correct";
    }
}
