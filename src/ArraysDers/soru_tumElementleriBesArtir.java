package ArraysDers;

import java.util.Arrays;

public class soru_tumElementleriBesArtir {
    public static void main(String[] args) {
        // // Verilen bir int arrray'deki tum elemntleri 5 artirin
        int[] arr={3,5,9,6,3};
        for (int i = 0; i < arr.length; i++) {
           arr[i]+=5;
        }

        System.out.println(Arrays.toString(arr));

    }
}
