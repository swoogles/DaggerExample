package com.example.modules;

import com.example.transportation.AirTransportation;
import com.example.transportation.GoldenEagle;
import com.example.transportation.GroundTransportation;
import com.example.transportation.Horse;
import dagger.Provides;
import dagger.Module;

@Module
public class DomesticationModule {

    @Provides
    static GroundTransportation provideGroundTransportation() {
        return new Horse();
    }

    @Provides
    static AirTransportation provideAirTransportation() {
        return new GoldenEagle();
    }
}
