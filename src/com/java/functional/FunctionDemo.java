package com.java.functional;


import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

// A functional interface to accept an input and bring out an output, the simple way is java functional
//interface
public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String,Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Ephraim"));


        Function<String,Integer> function = (String s) -> s.length();
        System.out.println( function.apply("Ephraim"));
    }
}