package com.inner_classes_demo;

public class OuterClassC {
    private int dataOuter;

    public class InnerClass {
        private int data = 10;

        public void innerMethod() {

        }
    }

    public class AnotherInnerClass {
        public void method() {
            InnerClass innerClass = new InnerClass();
            innerClass.data = 20;
            dataOuter = 30;
            innerClass.innerMethod();
            StaticInnerClass staticInnerClass=new StaticInnerClass();
            staticInnerClass.staticInnerMethod();
        }
    }

    public static class StaticInnerClass {
        public void staticInnerMethod() {
            AnotherStaticInnerClass anotherStaticInnerClass = new AnotherStaticInnerClass();
            anotherStaticInnerClass.staticInnerData=10;
        }
    }

    public static class AnotherStaticInnerClass {
        private int staticInnerData = 20;
    }
}
