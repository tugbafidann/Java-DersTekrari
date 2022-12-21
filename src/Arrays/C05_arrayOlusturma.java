package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_arrayOlusturma {
    public static void main(String[] args) {
        //  Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dizinin boyutunu giriniz : ");
        int boyut= scan.nextInt();
        int[]arr=new int[boyut];
        System.out.println(Arrays.toString(arrayOlusturun(arr)));
    }
    public static int[] arrayOlusturun(int[] arr){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dizinin elemanlarini girin");
        for (int i = 0; i <arr.length ; i++) {
            int girilenSayi=scan.nextInt();
            arr[i]=girilenSayi;
        }
        return arr;
    }
}
