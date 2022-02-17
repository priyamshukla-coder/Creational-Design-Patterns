package com.company;
import java.lang.Math;
import java.util.*;

public class Prototype_Design_Pattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        shop obj=new shop();
        obj.setShop_name("Shop");
        obj.book_data();
        System.out.println(obj);

        //Lets create a new object over here of shop
        /*shop obj1=new shop();
        obj1.setShop_name("New Shop");
        obj1.book_data(); //But fetching data from here takes time and so lets ask shop 1 to give us the data of the shop//
        System.out.println(obj1);*/

        shop obj1=obj.clone();
        obj.getBooks().remove(2);//this is shallow cloning as it is not fessabile to implement instead we must use deep cloning
        System.out.println(obj);//See the object after removing the index 2 book name //Deep copying 
        obj1.setShop_name("Shop 1");
        System.out.println(obj1);
    }
}

class Book{
    private int book_id;
    private String book_name;

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                '}';
    }
}

class shop implements Cloneable{
    private String shop_name;
    List books =new ArrayList<>();

    public String getShop_name() {
        return shop_name;
    }

    public List getBooks() {
        return books;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public void setBooks(List books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "shop{" +
                "shop_name='" + shop_name + '\'' +
                ", books=" + books +
                '}';
    }

    public void book_data(){
        for(int i=1;i<=10;i++){
            Book ob=new Book();
            ob.setBook_id(i);
            ob.setBook_name("Book_name "+i);
            getBooks().add(ob);

        }
    }
    //This is shallow copying
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
    @Override
    protected shop clone() throws CloneNotSupportedException{
        shop obj=new shop();
        for(Object b:this.getBooks() ){
            obj.getBooks().add(b);
        }
        return obj;
    }
}