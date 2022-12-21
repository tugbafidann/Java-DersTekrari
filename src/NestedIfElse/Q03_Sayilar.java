package NestedIfElse;

import java.util.Scanner;

public class Q03_Sayilar {
    public static void main(String[] args) {
        //- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz  :");
        double sayi= scan.nextDouble();
        if(sayi%2==1){
            if(sayi<0) System.out.println("Girilen sayi tek ve negatiftir");
            else System.out.println("Girilen sayi tek ve pozitiftir");
        } else if (sayi%2==0) {
            if(sayi%10==0) System.out.println("Sayi 10 un katıdır");
            else System.out.println("Girilen sayi 10'un katı degildir");
        }
    }
}
