package A10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=1;
        for(int i=a;i>0;i--){
            b *= i;
        }
        System.out.println(b);
        sc.close();
    }
}
