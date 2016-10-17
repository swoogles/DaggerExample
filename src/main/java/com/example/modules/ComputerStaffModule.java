package com.example.modules;

import com.example.routing.ComputerRouters;
import com.example.routing.RoutingSystem;
import dagger.Provides;
import dagger.Module;

@Module
public class ComputerStaffModule {

    @Provides
    static RoutingSystem provideComputerRouters() {
        return new ComputerRouters();
    }

}
