package com.indianstates;

import java.io.FileNotFoundException;

public class CustomExceptionIncorrectFile extends FileNotFoundException {
    @Override
    public String toString() {
        return  "File is incorrect";
    }
}
