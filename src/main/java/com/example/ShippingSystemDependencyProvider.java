package com.example;

import com.example.modules.HumanStaffModule;
import com.example.modules.PrimitiveModule;
import dagger.Component;

@Component(modules = {PrimitiveModule.class, HumanStaffModule.class})
//@Component(modules = {DomesticationModule.class, HumanStaffModule.class})
public interface ShippingSystemDependencyProvider {
    ShippingSystemDependencies dependencies();
}
