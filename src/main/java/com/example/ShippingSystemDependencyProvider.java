package com.example;

import dagger.Component;
import com.example.routing.HumanStaffModule;

@Component(modules = {PrimitiveModule.class, HumanStaffModule.class})
//@Component(modules = DomesticationModule.class)
public interface ShippingSystemDependencyProvider {
    ShippingSystemDependencies dependencies();
}
