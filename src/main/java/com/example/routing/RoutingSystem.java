package com.example.routing;

public abstract class RoutingSystem {
    // Calculate total time spent transferring items between methods of transportation
    private int transferPenalty;
    private double shrinkageFactor;

    public double routeItems(int numItems, int numTransfers) {
        return (numItems * shrinkageFactor) + (numTransfers * transferPenalty);
    }
}

class HumanRouters extends RoutingSystem {
    private int transferPenalty = 2;
    private double shrinkageFactor = 1.3;
}

class MonkeyRouters extends RoutingSystem {
    private int transferPenalty = 1;
    private double shrinkageFactor = 2.0;
}

class ComputerRouters extends RoutingSystem {
    private int transferPenalty = 5;
    private double shrinkageFactor = 1.0;
}
