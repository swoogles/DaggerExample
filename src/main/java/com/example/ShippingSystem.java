package com.example;

public class ShippingSystem {
    GroundTransportation groundTransportation;
    AirTransportation airTransportation;
    public ShippingSystem(ShippingSystemDependencies dependencies) {
      this.groundTransportation = dependencies.groundTransportation;
      this.airTransportation = dependencies.airTransportation;
    }

    double transport(int groundMiles, int airMiles) {
        return
                groundTransportation.transport(groundMiles)
                + airTransportation.transport(airMiles);
    }
}
