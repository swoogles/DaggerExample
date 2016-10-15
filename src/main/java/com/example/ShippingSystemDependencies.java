package com.example;

import javax.inject.Inject;

public class ShippingSystemDependencies {
    GroundTransportation groundTransportation;

    @Inject
    public ShippingSystemDependencies(GroundTransportation groundTransportation) {
        this.groundTransportation = groundTransportation;
    }
    //
    public GroundTransportation getGroundTransportation() {
        return groundTransportation;
    }

}
