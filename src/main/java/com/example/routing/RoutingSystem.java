package com.example.routing;

public abstract class RoutingSystem {
    // Calculate total time spent transferring items between methods of transportation
    private int transferPenalty;
    private double shrinkageFactor;

    public double routeItems(int numItems, int numTransfers) {
        return (numItems * shrinkageFactor) + (numTransfers * transferPenalty);
    }
}

