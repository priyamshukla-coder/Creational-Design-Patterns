package com.company;
import java.util.*;
public class Implementation_DEP_Abstract_Factory {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String n1=S.nextLine();
        String n2=S.nextLine();
        String n3=S.nextLine();
        String n4=S.nextLine();

        Action_Movie obj=new Action_Movie();
        Ibolly ob1=obj.get_bolly_movie();
        Itolly obj2=obj.get_tolly_movie();
        System.out.println(ob1.name(n1));
        System.out.println(obj2.name(n2));

        Comedy_Movie ob =new Comedy_Movie();
        Ibolly ob3=ob.get_bolly_movie();
        Itolly ob4=ob.get_tolly_movie();
        System.out.println(ob3.name(n3));
        System.out.println(ob4.name(n4));

    }
}
interface Itolly{
    public String name(String name);
}

interface Ibolly{
    public String name(String name);
}

interface IMovie_Factory{
    Itolly get_tolly_movie();
    Ibolly get_bolly_movie();
}

class tolly_Action_Movie implements Itolly{
    @Override
    public String name(String name) {
        return name+" "+"is a tollywood action movie";
    }
}

class tolly_Comedy_movie implements Itolly{
    @Override
    public String name(String name) {
        return name+" "+"is a tollywood comedy movie";
    }
}

class bollywood_action_movie implements Ibolly{
    @Override
    public String name(String name) {
        return name+" "+"is a bollywood action movie";
    }
}
class bollywood_comedy_movie implements Ibolly{
    @Override
    public String name(String name) {
        return name+" "+"is a bollywood comedy movie";
    }
}

class Action_Movie implements IMovie_Factory{
    public Ibolly get_bolly_movie(){
        return new bollywood_action_movie();
    }
    public Itolly get_tolly_movie(){
        return new tolly_Action_Movie();
    }
}

class Comedy_Movie implements IMovie_Factory{

    @Override
    public Itolly get_tolly_movie() {
        return new tolly_Comedy_movie();
    }

    @Override
    public Ibolly get_bolly_movie() {
        return new bollywood_comedy_movie();
    }
}