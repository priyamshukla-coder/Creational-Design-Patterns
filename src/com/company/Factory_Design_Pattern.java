package com.company;
import java.util.*;
interface os{
    public void characterstics();
}

class Operating_System{
    public os getInstance(String s){
        if(s.equals("Open-Source"))
            return  new Android();
        else if(s.equals("Secure-OS"))
            return new IOS();
        else
            return new Windows();
    }
}
class Android implements os{
    public void characterstics(){
        System.out.println("You are using the OPEN-SOURCE OS");
    }
}

class IOS implements os{
    public void characterstics(){
        System.out.println("You are using a Closed Source OS");
    }
}

class Windows implements os{
    public void characterstics(){
        System.out.println("You are using WINDOWS OS");
    }
}

public class Factory_Design_Pattern {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Operating_System obj = new Operating_System();
        os obj1=obj.getInstance("Open-Source");
        //Suppose we want to use open source so simply we are using Android os but its code is hidden from the user.
        //Similarly it goes for Windows or any os we want to use.
        obj1.characterstics();
    }
}

//Here is the problem as when we are calling the object we are exposing the code to the user
//As oer our demand we are calling the Android or IOS or Windows.
//Instead of doing this we can have a os class and from that we can get the instance of the os as per user requirement
