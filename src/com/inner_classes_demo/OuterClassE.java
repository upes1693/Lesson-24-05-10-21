package com.inner_classes_demo;

public class OuterClassE {
    BaseInterface baseInterface=new BaseInterface() {
        @Override
        public void methodA() {
            System.out.println("baseInterface instance methodA");
        }

        @Override
        public void methodB() {
            System.out.println("baseInterface instance methodB");
        }
    };

    BaseInterface baseInterface2=new BaseInterface() {
        @Override
        public void methodA() {

        }

        @Override
        public void methodB() {

        }
    };

    public void method(){
        baseInterface.methodA();
        baseInterface.methodB();
        baseInterface2.methodA();
        baseInterface2.methodB();
    }
}
