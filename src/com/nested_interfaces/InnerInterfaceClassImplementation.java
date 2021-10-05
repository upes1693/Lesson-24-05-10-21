package com.nested_interfaces;

public class InnerInterfaceClassImplementation implements OuterInterface.NestedInterface{
    @Override
    public void method() {
        System.out.println("Writing from a class implementation of an inner interface");
    }
}
