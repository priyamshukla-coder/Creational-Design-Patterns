package com.company;

public class Abstract_Factory_Design_Pattern {
    public static void main(String[] args) {
        utensilfactory obj=FactoryProducer.getFactory("Stainless");
        System.out.println(obj);
        utensil obj1=obj.getplate();
        System.out.println(obj1.price());
    }
}

interface utensil{
    int price();
    String utensil_name();
    int capacity();
}

class round_plate implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=100;
        return price;
    }
    public String utensil_name(){
        this.name="round-plate";
        return name;
    }
    public int capacity(){
        this.capacity=4;
        return capacity;
    }
}

class glass implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=50;
        return price;
    }
    public String utensil_name(){
        this.name="glass";
        return name;
    }
    public int capacity(){
        this.capacity=10;
        return capacity;
    }
}

class cup implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=40;
        return price;
    }
    public String utensil_name(){
        this.name="cup";
        return name;
    }
    public int capacity(){
        this.capacity=2;
        return capacity;
    }
}

class ns_cup implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=20;
        return price;
    }
    public String utensil_name(){
        this.name="ns_cup";
        return name;
    }
    public int capacity(){
        this.capacity=2;
        return capacity;
    }
}

class ns_glass implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=40;
        return price;
    }
    public String utensil_name(){
        this.name="ns_glass";
        return name;
    }
    public int capacity(){
        this.capacity=2;
        return capacity;
    }
}

class ns_plate implements utensil{
    int price;
    String name;
    int capacity;
    public int price(){
        this.price=40;
        return price;
    }
    public String utensil_name(){
        this.name="ns-plate";
        return name;
    }
    public int capacity(){
        this.capacity=2;
        return capacity;
    }
}

class stainless_steel_utensils{
    public utensil getround_plate(){
        return new round_plate();
    }
    public utensil getglass(){
        return new glass();
    }
    public utensil getcup(){
        return new cup();
    }
}

class non_stainless_steel_utensils{
    public utensil getcup(){
        return new ns_cup();
    }
    public utensil getglass(){
        return new ns_glass();
    }
}

interface utensilfactory{
    public utensil getplate();
    public utensil getcup();
    public utensil getglass();
}

class stainless_Steel implements utensilfactory{
    public utensil getplate(){
        return new round_plate();
    }
    public utensil getcup(){
        return new cup();
    }
    public utensil getglass(){
        return new glass();
    }
}

class non_stainless_steel implements utensilfactory{
    public utensil getplate(){
        return new ns_plate();
    }
    public utensil getglass(){
        return new ns_glass();
    }
    public utensil getcup(){
        return new ns_cup();
    }
}

class FactoryProducer {
    public static utensilfactory getFactory(String ch){

        if("Stainless".equalsIgnoreCase(ch)){
            return new stainless_Steel();
        }
        else if("Non-Stainless".equalsIgnoreCase(ch)){
            return new non_stainless_steel();
        }
        return null;
    }
}