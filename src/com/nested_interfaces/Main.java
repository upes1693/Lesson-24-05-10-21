package com.nested_interfaces;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        innerClass.method();

        new OuterClass.NestedInterface () {
            @Override
            public void method() {
                System.out.println("Writing from anonymous class which implements nested interface");
            }
        }.method();

        OuterClass.NestedInterface nestedInterface= new OuterClass.NestedInterface () {
            @Override
            public void method() {
                System.out.println("Writing from anonymous class which implements nested interface");
            }
        };

        nestedInterface.method();

        InnerInterfaceClassImplementation innerInterfaceClassImplementation=new InnerInterfaceClassImplementation();
        innerInterfaceClassImplementation.method();

        OuterInterface.NestedInterface nestedInterface1=new OuterInterface.NestedInterface() {
            @Override
            public void method() {
                System.out.println("Writing from an anonymous class implementation of inner interface");
            }
        };
        nestedInterface1.method();

        OuterInterface2.InnerClass innerClass1=new OuterInterface2.InnerClass();
        innerClass1.method();
        innerClass1.outerMethod();
    }
}
