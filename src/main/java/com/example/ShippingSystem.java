package com.example;

public class ShippingSystem {
    GroundTransportation groundTransportation;
    public ShippingSystem(ShippingSystemDependencies dependencies) {
      this.groundTransportation = dependencies.groundTransportation;
    }

    double transport(int groundMiles) {
        return groundTransportation.transport(groundMiles);
    }
}
