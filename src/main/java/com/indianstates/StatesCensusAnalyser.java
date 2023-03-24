package com.indianstates;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Header{
    String id,state,population;

    public Header(String id, String state, String population) {
        this.id = id;
        this.state = state;
        this.population = population;
    }

    @Override
    public String toString() {
        return this.id+" "+this.state+" "+this.population;
    }
}
