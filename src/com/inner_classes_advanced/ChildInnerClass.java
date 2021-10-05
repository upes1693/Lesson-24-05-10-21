package com.inner_classes_advanced;

public class ChildInnerClass extends OuterClassB.InnerClass {
    public ChildInnerClass(){
        new OuterClassB().super();
    }
}
