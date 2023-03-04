package StringManiplation;

import java.awt.*;
import java.util.Scanner;

public class Q04_YeniSifre {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz : ");
        String sifre= scan.nextLine();
        int sayac=0;
        if ((sifre.charAt(0)>='a' && sifre.charAt(0)<='z'))
            sayac++;
        else System.out.println("Lutfen ilk harfi kuçuk harf olarak giriniz"); ;
        if (sifre.charAt(sifre.length()-1)>='1'&& sifre.charAt(sifre.length()-1)<='9')
            sayac++;
        else System.out.println("Son karakter rakam olmali");
        if(!sifre.contains(" "))
            sayac++;
        else System.out.println("Sifrede bosluk bulunmamalı");
        if((sifre.length()>=10))
            sayac++;
        else System.out.println("Sifre en az 10 karakterli olmali");
        if(sayac==4)
            System.out.println("Sifre basariyla kaydedildi");
        else System.out.println("Sifreyi tekrar giriniz : ");





    }
}
