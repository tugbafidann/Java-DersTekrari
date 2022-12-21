package DataCasting;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. ondalikli sayiyi giriniz : ");
        double dblSayi1= scan.nextDouble();
        System.out.println("Lutfen 2. ondalikli sayiyi giriniz : ");
        double dblSayi2=scan.nextDouble();
        System.out.println("Sayilarin tam bolen sonucu : "+(int) (dblSayi1/dblSayi2));
    }
}
