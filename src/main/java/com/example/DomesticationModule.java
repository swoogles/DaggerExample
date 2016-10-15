package com.example;

        import dagger.Provides;
        import dagger.Module;

@Module
class DomesticationModule {

    @Provides
    static GroundTransportation provideGroundTransportation() {
        return new Horse();
    }

    @Provides
    static AirTransportation provideAirTransportation() {
        return new GoldenEagle();
    }
}
