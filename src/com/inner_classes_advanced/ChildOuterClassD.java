package com.inner_classes_advanced;

public class ChildOuterClassD extends OuterClassD{
    public void someMethod(){
        x=1;
        method();
        OuterClassD.InnerClass innerClass=new InnerClass();
        innerClass.innerMethod();
    }

    public class ChildInnerClass extends OuterClassD.InnerClass{
        @Override
        public void innerMethod() {
            System.out.println("Overridden successfully");
        }
    }
}
