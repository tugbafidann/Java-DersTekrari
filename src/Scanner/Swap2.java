package Scanner;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz : ");
        int sayi1= scan.nextInt();  // 5
        System.out.println("Lutfen 2. sayiyi giriniz : ");
        int sayi2= scan.nextInt();  // 4
        sayi1=sayi2+sayi1;  //  sayi1=4+5=9  ==>sayi1=9
        sayi2=sayi1-sayi2;  // sayi2=9-4=5   ==> sayi2=5
        sayi1=sayi1-sayi2;  // sayi1=9-5=4   ==> sayi1=4
        System.out.println("sayi1 : "+sayi1+"\nsayi2 : "+sayi2);

    }
}
