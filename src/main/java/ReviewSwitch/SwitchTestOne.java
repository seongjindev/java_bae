package ReviewSwitch;

import java.util.Scanner;

public class SwitchTestOne {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a + "입니다");
                break;
            default:
                System.out.println("No");

        }



        sc.close();
    }
}
