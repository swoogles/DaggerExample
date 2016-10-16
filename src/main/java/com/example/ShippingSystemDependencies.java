package com.example;

import com.example.routing.RoutingSystem;

import javax.inject.Inject;

public class ShippingSystemDependencies {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;
    RoutingSystem routingSystem;

    @Inject
    public ShippingSystemDependencies(GroundTransportation groundTransportation, AirTransportation airTransportation, RoutingSystem routingSystem) {
        this.groundTransportation = groundTransportation;
        this.airTransportation = airTransportation;
        this.routingSystem = routingSystem;
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

}
