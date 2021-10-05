package com.inner_classes_advanced;

public class OuterClassA {

    public class InnerClass{
        private int data=10;
        void innerMethod(){
            System.out.println("Inner Method");
        }
    }

    public class ChildInnerClass extends InnerClass{

    }
}
