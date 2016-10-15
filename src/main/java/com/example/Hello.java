package com.example;

class Hello {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ShippingSystemDependencyProvider dependencyProvider =
                DaggerShippingSystemDependencyProvider.create();
        ShippingSystemDependencies dependencies = dependencyProvider.dependencies();
        ShippingSystem completedShippingSystem = new ShippingSystem(dependencies);
        int groundMiles = 20;
        double totalCost = completedShippingSystem.transport(groundMiles);
        System.out.println("totalCost: " + totalCost);
    }
}
