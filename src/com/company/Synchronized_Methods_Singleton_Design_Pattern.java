package com.company;

public class Synchronized_Methods_Singleton_Design_Pattern {
    public static void main(String[] args) {
        Thread p=new Thread(new Runnable() {
            @Override
            public void run() {
                C obj=C.getInstance();
                System.out.println(obj);
            }
        });

        Thread q=new Thread(new Runnable() {
            @Override
            public void run() {
                C obj=C.getInstance();
                System.out.println(obj);
            }
        });

        Thread r=new Thread(new Runnable() {
            @Override
            public void run() {
                C obj=C.getInstance();
                System.out.println(obj);
            }
        });

        p.start();
        q.start();
        r.start();
    }
}

//But as we see the output now each time the thread starts new instnace of class is created hence the concept of Singleton is Hampered
//Hence we use the concept of Synchronized Methods

class C{
    public static C obj;
    private C(){
        System.out.println("Objects Created");
    }
    //This part is for Synchronized Methods
    public static synchronized C getInstance(){
        if(obj==null) {
            obj = new C();
        }
        return obj;
    }
}

//Now the problem with this method of Synchronized methods is that if the method takes more processing time
//Hence till then one thread completes the process others have to wait
//So to avoid this and also to use the concept of Singleton Design Pattern we use Double Check Locking
//In this method we check the object two times
//Instead of making the method synchronized at the time of creation we are making it synchronized at the time of checking