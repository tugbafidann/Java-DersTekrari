package ArraysDers;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Arrayin boyutunu giriniz : ");
       int boyut=scan.nextInt();
       System.out.println("Arrayin elemanlarını giriniz : ");
        int[] arr1=new int[boyut];
        for (int i = 0; i <arr1.length ; i++) {
            int girilenSayi=scan.nextInt();
            arr1[i]=girilenSayi;
        }
        System.out.println(Arrays.toString(arr1));





    }
}
