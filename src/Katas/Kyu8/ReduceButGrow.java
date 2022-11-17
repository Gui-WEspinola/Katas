package Katas.Kyu8;

import java.util.Arrays;

public class ReduceButGrow {
    public static int grow(int[] x){
        Arrays.sort(x);
        Integer cont = 1;
        for (int number : x) {
            cont *= number;
        }
        return cont;
    }
}
