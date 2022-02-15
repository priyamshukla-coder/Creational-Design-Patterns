package com.company;

public class Double_Checked_Locking_Singleton_Design_Pattern {
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

class D{
    static D obj;
    private D(){
        System.out.println("Instnace Created");
    }
    public static D getInstance(){
        if(obj==null){
            synchronized (D.class){
                if(obj==null){
                    obj=new D();
                }
            }
        }
        return obj;
    }
}