package com.example;

import com.example.routing.RoutingSystem;

public class ShippingSystem {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;
    RoutingSystem routingSystem;
    public ShippingSystem(ShippingSystemDependencies dependencies) {
      this.groundTransportation = dependencies.groundTransportation;
      this.airTransportation = dependencies.airTransportation;
      this.routingSystem = dependencies.routingSystem;
    }

    double transport(int groundMiles, int airMiles) {
        int numTransfers = 10;
        int numPackages = 5;
        return
                groundTransportation.transport(groundMiles)
                + airTransportation.transport(airMiles)
                + routingSystem.routeItems(numPackages, numTransfers);
    }
}
