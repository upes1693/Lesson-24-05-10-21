package com.inner_classes_advanced;

public class OuterClassC {
    int x;

    public void outerMethod(){
        System.out.println("outerMethod");
    }

    public class AnotherInnerClass{

    }
    public class InnerClass extends OuterClassC{
        public void method(){
            x=10;
            outerMethod();
            AnotherInnerClass anotherInnerClass=new AnotherInnerClass();
        }

        @Override
        public void outerMethod() {
            System.out.println("Hello from Inner Class");;
        }
    }
}
