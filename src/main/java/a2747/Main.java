package a2747;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(pb(0,a));
    }
    public static int pb(int b,int n){
        if( b == n){
            return n;
        }else{
            return pb(b,n) + pb(b+1,n);
        }

    }
}
