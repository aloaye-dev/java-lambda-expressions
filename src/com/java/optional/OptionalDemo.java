package com.java.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // How to create an optional object
        // of , empty, ofNullable

        String email = null;
// of, empty,ofNullable
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emptyOptional);
//
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
        // orElse()
//        String  defaultOptional = stringOptional.orElse("please-add-anEmail@gmail.com");
//        System.out.println(defaultOptional);

        //////////////////////////////////////////////////////
        //if present method
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyOptional = Optional.empty();

        gender.ifPresent((s)-> System.out.println("value not present"));
        emptyOptional.ifPresent((s)-> System.out.println("no value present"));
        ////////////////////////////////////////////////////////////////////////////////////////////
        //Optional ()filter
        String result = " abc ";
        if (result != null && result.contains("abc")){
            System.out.println(result);
        }
        Optional<String> optionalStr= Optional.of(result);
        optionalStr.filter((res)-> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res)-> System.out.println(res));

        //Map method in optional provides a wa to transform value in optional from one type to another



        // orElseThrow
//        String defaultOptional3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email does not exist"));
//        System.out.println(defaultOptional3);

        //orElseGet uses Lambda expression
//        String defaultOptional2 = stringOptional.orElseGet(() -> "lambda@gmail.com");
//        System.out.println(defaultOptional2);
        //Incase no value is present. we use the if statement
//        if(stringOptional.isPresent()){
//            System.out.println(stringOptional.get());
//        } else{
//            System.out.println("no value present");
//        }
    }
}
