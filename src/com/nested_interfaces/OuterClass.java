package com.nested_interfaces;

public class OuterClass {

    interface NestedInterface{
        void method();
    }

    class InnerClass implements NestedInterface{
        @Override
        public void method() {
            System.out.println("Writing from inner class which is implementing an inner interface");
        }
    }
}
