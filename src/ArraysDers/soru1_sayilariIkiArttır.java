package ArraysDers;

import java.util.Arrays;

public class soru1_sayilariIkiArttır {
    public static void main(String[] args) {
        // verilen araryde sayilari 2 arttirip bize döndüren bir method yaziniz
        int[] arr={1,7,9,5,6};
        System.out.println(Arrays.toString(sayilariArttir(arr)));
    }
    public static int[] sayilariArttir(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;
        }
        return arr;
    }
}
