package com.inner_classes_demo;

public class Main {

    public static void main(String[] args) {
//        OuterClass outerClass=new OuterClass();
//        outerClass.outerMethod();
//        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
//        innerClass.doSomething();
        //----------------------------------------
//        OuterClassB.StaticInnerClass staticInnerClass=new OuterClassB.StaticInnerClass();
//        OuterClassB outerClassB=new OuterClassB();
//        outerClassB.outerMethod();
        //----------------------------------------
//        OuterClassD outerClassD=new OuterClassD();
//        outerClassD.outerMethod();
        //----------------------------------------
        OuterClassE outerClassE = new OuterClassE();
        outerClassE.method();

        BaseClass baseClass=new BaseClass(){
            @Override
            void doSomething(){
                System.out.println("Do Nothing");
            }
        };

        baseClass.doSomething();
    }
}
