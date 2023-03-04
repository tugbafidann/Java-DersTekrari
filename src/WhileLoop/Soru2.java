package WhileLoop;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int girilenSayi= scan.nextInt(); // 15
        int rakamlarToplam=0;
        int birlerBasamagi=0;
        while (girilenSayi!=0){
            birlerBasamagi=girilenSayi%10;
            rakamlarToplam+=birlerBasamagi;
            girilenSayi=girilenSayi/10;
        }
        System.out.println(rakamlarToplam);


    }
}
