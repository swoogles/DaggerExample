package com.example.modules;

import com.example.transportation.AirTransportation;
import com.example.transportation.BicycleCopter;
import com.example.transportation.Courier;
import com.example.transportation.GroundTransportation;
import dagger.Provides;
import dagger.Module;

@Module
public class PrimitiveModule {

    @Provides
    static GroundTransportation provideGroundTransportation() {
        return new Courier();
    }

    @Provides
    static AirTransportation provideAirTransportation() {
        return new BicycleCopter();
    }
}
