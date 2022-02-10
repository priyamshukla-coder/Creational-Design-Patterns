package com.company.com.company;

public class Singleton_Design_Pattern {
    public static void main(String[] args) {
        A obj=A.get_object();
        System.out.println(obj);
        //lets create a new object but it will not be a new it will have the instance of the old object

        //A obj1=new A();//We cant create a object by new keyword as by default we have made the constructor as private.

        A obj1=A.get_object(); // Although this object is created but it will have the same instance now as we have made our class Singleton
        System.out.println(obj1);
    }
}

class A{
    //Step 1 : To make a singleton class we need to amke a static object(Static instance) of that class in the class itself.
    static A obj=new A();

    //Step 2 : Do not allow user to create an instance with default constructor (by default which is public)
    private A(){

    }

    //Step 3 : Create a method which should be static and which will return the object or instance of the class.
    public static A get_object(){
        return obj;
    }

    //Following above steps will ake our class singleton and now we cant create a new instance
}