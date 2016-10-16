package com.example.routing;

import dagger.Provides;
import dagger.Module;

@Module
public class HumanStaffModule {

    @Provides
    static RoutingSystem provideHumanRouters() {
        return new HumanRouters();
    }

}
