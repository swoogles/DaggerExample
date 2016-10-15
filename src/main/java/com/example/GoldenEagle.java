package com.example;

public class GoldenEagle implements AirTransportation {
    double mileage = 50.0;

    public double transport(int distance) {
        return mileage / distance;
    }
}
