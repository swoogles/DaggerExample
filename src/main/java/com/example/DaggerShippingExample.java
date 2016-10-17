package com.example;

class DaggerShippingExample {
    public static void main(String[] args) {
        ShippingSystemDependencyProvider dependencyProvider =
            DaggerShippingSystemDependencyProvider.create();
        ShippingSystemDependencies dependencies = dependencyProvider.dependencies();
        ShippingSystem completedShippingSystem = new ShippingSystem(dependencies);
        int groundMiles = 20;
        int airMiles = 10;
        int numTransfers = 10;
        int numPackages = 5;
        double totalCost = completedShippingSystem.transport(groundMiles, airMiles, numTransfers, numPackages);
        System.out.println("totalCost: " + totalCost);
    }
}
