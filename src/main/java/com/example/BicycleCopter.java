package com.example;

public class BicycleCopter implements AirTransportation {
    double mileage = 200.0;

    public double transport(int distance) {
        return mileage / distance;
    }
}
