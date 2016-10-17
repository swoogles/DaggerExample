package com.example.transportation;

public class Horse implements GroundTransportation {
    double mileage = 50.0;

    public double transport(int distance) {
        return mileage / distance;
    }
}
