package com.nested_interfaces;

public interface OuterInterface2 {
    void outerMethod();

    class InnerClass implements OuterInterface2 {
        int x;

        public void method() {
            System.out.println("method");
            System.out.println(x);
        }

        @Override
        public void outerMethod() {
            System.out.println("outer method implementation");
        }
    }
}
