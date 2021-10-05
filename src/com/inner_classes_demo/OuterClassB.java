package com.inner_classes_demo;

public class OuterClassB {
    private static int data = 10;
    public void outerMethod() {
        StaticInnerClass staticInnerClass=new StaticInnerClass();
        staticInnerClass.doSomething();
    }

    public static class StaticInnerClass {
        public void doSomething() {
            System.out.println("data is: " + data);
            //outerMethod();
        }
    }
}
