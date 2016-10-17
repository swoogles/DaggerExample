package com.example.transportation;

public class Courier implements GroundTransportation {
    double mileage = 100;

    public double transport(int distance) {
        return mileage / distance;
    }
}
