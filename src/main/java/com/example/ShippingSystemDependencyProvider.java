package com.example;

import com.example.modules.ComputerStaffModule;
import com.example.modules.HumanStaffModule;
import com.example.modules.PrimitiveModule;
import com.example.modules.DomesticationModule;
import dagger.Component;

//@Component(modules = {PrimitiveModule.class, HumanStaffModule.class})
@Component(modules = {DomesticationModule.class, ComputerStaffModule.class})
public interface ShippingSystemDependencyProvider {
    ShippingSystemDependencies dependencies();
}
