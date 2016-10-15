package com.example;

import dagger.Provides;
import dagger.Module;

@Module
class PrimitiveModule {

    @Provides
    static GroundTransportation provideGroundTransportation() {
        return new Courier();
    }

}