package com.example;

public class Courier implements GroundTransportation {
    double mileage = 100;

    public double transport(int distance) {
        return mileage / distance;
    }
}
