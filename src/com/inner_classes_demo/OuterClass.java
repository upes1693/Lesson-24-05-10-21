package com.inner_classes_demo;

public class OuterClass {
    private int data=10;
    private InnerClass innerClass= new InnerClass();

    public void outerMethod(){
        System.out.println("outer");
        innerClass.dataInner=30;
        innerClass.doSomething();
    }

    private class InnerClass{
        public InnerClass(){

        }

        public int dataInner=20;
        public void doSomething(){
            System.out.println("Data is: "+data);
            //outerMethod();
        }
    }
}
