package com.inner_classes_advanced;

public class OuterClassB {
    public class InnerClass{
        int data=3;
        public void innerMethod(){
            System.out.println("Inner Method");
        }
    }

    public static class StaticInnerClass{
        int data=5;
        public void staticInnerMethod(){
            System.out.println("Static Inner Method");
        }
    }
}
