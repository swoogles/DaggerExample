package com.example;

import com.example.packing.PackingSystem;
import com.example.routing.RoutingSystem;
import com.example.transportation.AirTransportation;
import com.example.transportation.GroundTransportation;

import javax.inject.Inject;

public class ShippingSystemDependencies {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;
    RoutingSystem routingSystem;
    PackingSystem packingSystem;

    @Inject
    public ShippingSystemDependencies(GroundTransportation groundTransportation, AirTransportation airTransportation, RoutingSystem routingSystem, PackingSystem packingSystem) {
        this.groundTransportation = groundTransportation;
        this.airTransportation = airTransportation;
        this.routingSystem = routingSystem;
        this.packingSystem = packingSystem;
    }
    //
    public GroundTransportation getGroundTransportation() {
        return groundTransportation;
    }
    public AirTransportation getAirTransportation() {
        return airTransportation;
    }
    public RoutingSystem getRoutingSystem() {
        return routingSystem;
    }
    public PackingSystem getPackingSystem() {
        return packingSystem;
    }

}
