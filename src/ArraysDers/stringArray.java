package ArraysDers;

import java.util.Arrays;

public class stringArray {
    public static void main(String[] args) {
        // arrayin tüm elemanlarını yazdırın
        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        System.out.println(Arrays.toString(isimler));
        for (int i = 0; i <isimler.length ; i++) {
            System.out.print(isimler[i] + " ");


        }
    }
}
