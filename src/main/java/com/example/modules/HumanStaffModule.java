package com.example.modules;

import com.example.routing.HumanRouters;
import com.example.routing.RoutingSystem;
import dagger.Provides;
import dagger.Module;

import com.example.packing.PackingSystem;
import com.example.packing.HumanPackers;

@Module
public class HumanStaffModule {

    @Provides
    static RoutingSystem provideHumanRouters() {
        return new HumanRouters();
    }

    @Provides
    static PackingSystem provideHumanPackers() {
        return new HumanPackers();
    }
}
