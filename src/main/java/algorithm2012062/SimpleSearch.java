package algorithm2012062;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        for(int i = 0; i<a.length-1; i++){
            if(b==a[i]){
                System.out.println("find");
            }
        }
    }
}
