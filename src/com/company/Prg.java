package com.company;
import java.util.*;
public class Prg {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    static int reverse_num(int number){
        int reverse=0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return reverse;
    }
    static int find_factors(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String str=S.nextLine();
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String arr[];
        arr=str.split(" ");
        System.out.println(str);
        List<Integer> l1=new ArrayList<Integer>();
        for(String i:arr){
            int val=Integer.parseInt(i);
            l1.add(val);
        }
        if (l1.size()==0){
            System.out.println(-1);
            System.exit(0);
        }
        int last_sum=0;
        for(int i:l1){
            last_sum=last_sum+(i%10);
        }
        //System.out.println(last_sum);
        int rev_num=reverse_num(last_sum);
        boolean check=isPrime(last_sum);
        boolean check1=isPrime(rev_num);
        if(check){
            System.out.println(last_sum);
        }
        else if(check1){
            System.out.println(rev_num);
        }
        else{
            System.out.println(find_factors(rev_num));
        }
    }
}
