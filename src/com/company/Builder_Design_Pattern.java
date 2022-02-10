package com.company;

public class Builder_Design_Pattern {
    public static void main(String[] args) {
        /*laptop obj=new laptop("DELL",30,"i5 7 Generation",8); //Here we need to the pass the parameters and for this we need to remember the order in which parameters must be passed
        System.out.println(obj);*/

        //Now instead of laptop class object we call here laptop config class object//
        laptop obj=new laptop_config().setLaptop_name("DELL").setProcessor("i5 7 Generation").get_laptop();
        System.out.println(obj);
        //so here basically we have not set all the values and those values by default will have the default values and hence we will not have any error for not passing them.
    }
}

class laptop{
    private String laptop_name;
    private int battery_power;
    private String processor;
    private int RAM;

    public laptop(String laptop_name, int battery_power, String processor, int RAM) {
        super();
        this.laptop_name = laptop_name;
        this.battery_power = battery_power;
        this.processor = processor;
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "laptop_name='" + laptop_name + '\'' +
                ", battery_power=" + battery_power +
                ", processor='" + processor + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}

class laptop_config{
    private String laptop_name;
    private int battery_power;
    private String processor;
    private int RAM;

    public laptop_config setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
        return this;
    }

    public laptop_config setBattery_power(int battery_power) {
        this.battery_power = battery_power;
        return this;
    }

    public laptop_config setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public laptop_config setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public laptop get_laptop(){
        return new laptop(laptop_name,battery_power,processor,RAM);
    }
}