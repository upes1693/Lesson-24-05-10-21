package com.inner_classes_demo;

public class OuterClassD {
    private int data = 10;

    public void outerMethod() {
        int methodData = 50;
        class LocalInnerClass {
            public void localInnerMethod() {
                System.out.println("Local Inner Method");
                System.out.println(data);
                System.out.println(methodData);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerMethod();
    }

    public void innerMethodTwo(){
        boolean isTrue=true;
        class LocalInnerIfBlockClass {
            int data = 10;
        }

        if (isTrue){
            LocalInnerIfBlockClass localInnerIfBlockClass=new LocalInnerIfBlockClass();
        }
        else  {
            LocalInnerIfBlockClass localInnerIfBlockClass=new LocalInnerIfBlockClass();
        }
    }
}
