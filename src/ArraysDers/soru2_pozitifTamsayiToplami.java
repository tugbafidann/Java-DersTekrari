package ArraysDers;

import java.util.Arrays;

public class soru2_pozitifTamsayiToplami {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.
        int[] arr={-1,5,7,-9,-2,6};
        System.out.println(sayiTopla(arr));
    }
    public static int sayiTopla(int[] arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        return toplam;
    }
}
