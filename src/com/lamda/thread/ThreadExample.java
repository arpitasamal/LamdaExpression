package com.lamda.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable=()->
        {
            System.out.println("5 table is ");
            for(int i=1;i<=10;i++)
            {

                System.out.println(i*5);
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                   e.printStackTrace();
                }

            }
        };
        Thread th=new Thread(runnable);
        th.setName("Thread1");
        th.start();
    }
}
