package com.company;

import java.util.*;

public class DEP_Implementation_Builder {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int w=S.nextInt();
        int l=S.nextInt();

        int bike_wheel=S.nextInt();
        int bike_light=S.nextInt();

        vehicle v=Builder.getProduct("Car");
        v.insertwheels(w);
        v.insertlights(l);
        v.body();

        System.out.println();

        vehicle v1=Builder.getProduct("Bike");
        v1.body();
        v1.insertlights(bike_light);
        v1.insertwheels(bike_wheel);
    }
}

interface vehicle{
    void body();
    void insertwheels(int w);
    void insertlights(int l);
}

class car implements vehicle{
    public car(){
        System.out.println("Here is the details of the car");
    }

    @Override
    public void body() {
        System.out.println("Car Body");
    }

    @Override
    public void insertwheels(int w) {
        System.out.println(w+" Wheels added to Car");
    }

    @Override
    public void insertlights(int l) {
        System.out.println(l+" lights added to car");
    }
}

class bike implements vehicle{
    public bike(){
        System.out.println("Here is the details of the bike");
    }

    @Override
    public void body() {
        System.out.println("Bike Body");
    }

    @Override
    public void insertwheels(int w) {
        System.out.println(w+" Wheels added to Bike");
    }

    @Override
    public void insertlights(int l) {
        System.out.println(l+" Lights added to Bike");
    }
}

class Builder
{
    public static vehicle getProduct(String ch)
    {
        if(ch.equalsIgnoreCase("Car"))
            return new car();
        else if(ch.equalsIgnoreCase("Bike"))
            return new bike();
        return null;
    }
}
