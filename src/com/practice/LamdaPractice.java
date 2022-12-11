package com.practice;

public class LamdaPractice {
    public static void main(String[] args) {
        System.out.println("arpita");
       /* MyinterImpl myinter=new MyinterImpl();
        myinter.sayHello();*/
        //Anonymous class
/*        Myinter ob=new Myinter() {
            @Override
            public void sayHello() {
              System.out.println("This is anonymous class");
            }
        };
        ob.sayHello();*/
        //lamda expression
        Myinter i = () -> System.out.println("ankit");
        i.sayHello();
        SumInter sumInter=(a,b)->{
            return a+b;

        };
        System.out.println(sumInter.sum(5,72));
        StringOperation stringOperation=(a)->
        {
            return a.length();
        };
     System.out.println(stringOperation.getlegth("Arpita"));


    }
}
