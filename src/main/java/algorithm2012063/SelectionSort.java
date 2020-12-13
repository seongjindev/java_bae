package algorithm2012063;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args){
        //int[] a = {5,6,2,7,8,9,1,3,4,0};
        List a = Arrays.asList(5,6,2,7,8,9,1,3,4,0);
        List b = new ArrayList();

        int c;
        int d = a.size();
        System.out.println(a.get(9));

        for(int i = 0; i<d-1;i++){
            c = lower(a);
            b.add(a.get(c));
            a.remove(c);

        }
        System.out.println(b);
    }
    public static int lower(List a){
        int smallest = (int) a.get(0);
        int smallest_idx = 0;

        for(int i = 0;i<=a.size()-1;i++){
            System.out.println(i);
            if((int)a.get(i) <= smallest){
                smallest_idx = i;
                smallest = (int)a.get(i);
            }
        }
        return smallest_idx;
    }
}
