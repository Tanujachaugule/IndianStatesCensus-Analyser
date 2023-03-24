package com.indianstates;

public class Census {

        int id;
        String state;
        String population;

        public Census(int id, String state, String population) {
            this.id = id;
            this.state = state;
            this.population = population;
        }

        @Override
        public String toString() {
            return this.id+", "+this.state+", "+this.population;
        }
    }

