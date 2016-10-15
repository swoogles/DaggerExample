package com.example;

import dagger.Component;

//@Component(modules = PrimitiveModule.class)
@Component(modules = DomesticationModule.class)
public interface ShippingSystemDependencyProvider {
    ShippingSystemDependencies dependencies();
}
