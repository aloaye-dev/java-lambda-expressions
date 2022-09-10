package com.java.defaultstatic;

interface Vehicle{
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarm(){
        return "turning vehicles alarm on";
    }
    default String turnAlarmOff(){
        return "turning the vehicles alarm off";
    }
    static  String getCompany(){
        return "german Brand";
    }
}

class car implements Vehicle{

    @Override
    public String getBrand() {
        return "Bmw";
    }

    @Override
    public String speedUp() {
        return "The car is on a high speed";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down";
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new car();

        System.out.println(  vehicle.getBrand());
        System.out.println( vehicle.slowDown());
        System.out.println(  vehicle.turnAlarm());
        ////
        System.out.println(Vehicle.getCompany());
    }
}
