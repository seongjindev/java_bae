package algorithm2012065;

import java.util.Scanner;

public class RecursionEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(onlyOne(a));

    }
    public static int onlyOne(int x){
        if(x == 1){
            return 1;
        }else{
            return onlyOne(x-1);
        }
    }
}
