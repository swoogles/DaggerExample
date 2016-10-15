package com.example;

import javax.inject.Inject;

public class ShippingSystemDependencies {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;

    @Inject
    public ShippingSystemDependencies(GroundTransportation groundTransportation, AirTransportation airTransportation) {
        this.groundTransportation = groundTransportation;
        this.airTransportation = airTransportation;
    }
    //
    public GroundTransportation getGroundTransportation() {
        return groundTransportation;
    }
    public AirTransportation getAirTransportation() {
        return airTransportation;
    }

}
