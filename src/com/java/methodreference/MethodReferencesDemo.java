package com.java.methodreference;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String msg);
}


public class MethodReferencesDemo {

    public void display(String msg){
        msg = msg.toLowerCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////

    //1, Method reference to a static method.
        // convert Lambda Expression to a method reference.

    Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(24));

        //Using method reference
        Function<Integer, Double> functionMethodRef =  Math::sqrt;
        System.out.println(functionMethodRef.apply(4));
/////////////////////////////////////////////////////////////////////////
        //Lambda expression
        BiFunction<Integer,Integer ,Integer > biFunctionLambda = (a , b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(30,40));

        // convert Lambda Expression to a method reference.
        BiFunction<Integer,Integer ,Integer > biFunctionLambdaEx = MethodReferencesDemo::addition;
        System.out.println(biFunctionLambdaEx.apply(12,19));

     //   2, Method to reference to an instance method of an object

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
        //Lambda Expression
        Printable printable = (msg)-> methodReferencesDemo.display(msg);
        printable.print("Hello Ray");

        /// Convert to a method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("All is well");
        /////////////////////////////////////////////////////////////////////////
//        4, Reference to an instance object of an arbitary object
//           Sometimes we call method of argument in the Lambda expression
//           In that case, we can use the method reference to call an instance
//           method of an arbitrary object of a specific type
        Function<String, String> stringFunction = (String input) -> input.toUpperCase();
        System.out.println(stringFunction.apply("Java guide"));

        ///convert to a method reference
        Function<String, String> stringFunctionMethodRef = String::toUpperCase;
        System.out.println( stringFunctionMethodRef.apply("convert to a method reference"));

        ////// More examples on Converting to a method reference
        String[] strArray = { "A" , "E" , "I" , "O" , "U" , "a" , "e", "i" , "o", "u"};

        //Using Lambda
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //using method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);

        //Reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("pawpaw");
        fruits.add("Apple");
        fruits.add("Guava");

        Function<List<String>, Set<String>> setFunction = (fruitsList)-> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));
        
        //Convert to a method reference
        Function<List<String>, Set<String>> setFunctionMethRef =  HashSet::new;
        System.out.println(setFunctionMethRef.apply(fruits));

    }
}
