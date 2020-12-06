package algorithm201206;

import java.util.Scanner;

import static java.lang.Math.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int low = 0;
        int high = a.length -1;
        int mid = 0;
        while(low <= high){

            mid = Math.round(((a[low] + a[high])/2));
            if(b < a[mid]){
                high = mid;
                System.out.println(mid);
            }else if(b > a[mid]){
                low = mid;
                System.out.println(mid);
            }else{
                System.out.println("find " + a[mid]);
                break;
            }

        }

    }

}
