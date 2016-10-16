package com.example.routing;

import dagger.Provides;
import dagger.Module;

@Module
public class ComputerStaffModule {

    @Provides
    static RoutingSystem provideComputerRouters() {
        return new ComputerRouters();
    }

}
