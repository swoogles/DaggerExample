package com.example;

import com.example.packing.PackingSystem;
import com.example.routing.RoutingSystem;
import com.example.transportation.AirTransportation;
import com.example.transportation.GroundTransportation;

public class ShippingSystem {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;
    RoutingSystem routingSystem;
    PackingSystem packingSystem;

    public ShippingSystem(ShippingSystemDependencies dependencies) {
      this.groundTransportation = dependencies.groundTransportation;
      this.airTransportation = dependencies.airTransportation;
      this.routingSystem = dependencies.routingSystem;
      this.packingSystem = dependencies.packingSystem;
    }

    double transport(int groundMiles, int airMiles) {
        int numTransfers = 10;
        int numPackages = 5;
        return
                groundTransportation.transport(groundMiles)
                + airTransportation.transport(airMiles)
                + routingSystem.routeItems(numPackages, numTransfers)
                + packingSystem.packItems(numPackages);
    }
}
