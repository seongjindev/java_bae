package algorithm2012064;

import java.util.Scanner;

public class RecursionEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));

    }
    public static int fact(int x){
        if(x==1){
            return 1;
        }else{
            return x * fact(x-1);
        }

    }
}
