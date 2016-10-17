package com.example.transportation;

public interface GroundTransportation extends ModeOfTransportation {
    double transport(int distance);
    int mileage = 1;
}
