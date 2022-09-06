package com.java.lambda;

public class Main {
    public static void main(String[] args) {

        String str ="hello";

     //   Shape rectangle = ()-> System.out.println("Rectangle class: Draw method()");
     //   rectangle.draw();

    //   Shape square =  ()-> System.out.println("Square Shape: draw method()");
    //   square.draw();

     //  Shape circle = ()-> System.out.println("Circle Shape: draw method ()");

       print( ()-> System.out.println("Rectangle class: Draw method()"));
       print(()-> System.out.println("Square Shape: draw method()"));
       print(()-> System.out.println("Circle Shape: draw method ()"));
    }

    private static void print(Shape shape){
        shape.draw();
    }
}
