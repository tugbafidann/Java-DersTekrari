package DataCasting;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        int sayi= scan.nextInt();
        System.out.println("Sayinin byte degeri : "+(byte)(sayi));


    }
}
