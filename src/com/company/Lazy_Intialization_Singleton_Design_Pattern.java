package com.company;

public class Lazy_Intialization_Singleton_Design_Pattern {
    public static void main(String[] args) {
        B obj=B.get_Object_Instance();
        System.out.println(obj);
        B obj1=B.get_Object_Instance(); // As here we created new object so again the get Instance method creates a new object
        //So here the concept of Singleton is hampered
        System.out.println(obj1);
    }
}
//In the previous code of singleton Design Pattern we have seen that as the object is static
//So every time the class is created the object of that class is created irrespective of whether we have called the object
//This is the concept of Eager Intialization
//In order to avoid this we use the concept of Lazy Intialization

class B{
    public static B obj;
    private B(){
        System.out.println("Object Created");
    }

    public static B get_Object_Instance(){
        if(obj==null) {
            obj = new B();
        }
        //Now only single object is created no matter how many times we have created the object
        return obj;
    }
}
//So the problem with this methods is that although now two separate objects are not created but if we have multiple threads
//And each thread starts the excution at the same time then separate instance of the object will be created
//So to avoid this we use the concept of Synchronized Methods