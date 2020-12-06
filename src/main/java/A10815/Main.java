package A10815;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] fir_input = new int[a];

        String aa = sc.nextLine();
        String[] a_arr = aa.split(" ");
        System.out.println(a_arr[4]);

        int c = sc.nextInt();
        int[] snd_input = new int[c];
        String bb = sc.nextLine();
        String[] b_arr = bb.split(" ");

        for(String fir : a_arr){
            for(int i =0; i<c;i++){
                if(fir.equals(b_arr[i])){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
        }


    }
}
