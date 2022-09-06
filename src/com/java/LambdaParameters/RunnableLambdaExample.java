package com.java.LambdaParameters;


class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.print("Run method called ()");
    }
}


public class RunnableLambdaExample {
    public static void main(String[]args){

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = ()->{
            System.out.println("Thread runnable using Lambda expression ...");
        };

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();
    }
}
