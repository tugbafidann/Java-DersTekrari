package Scanner;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Soru 7: Kullanicidan 2 deger alip degerlerini degistiren programi yaziniz(swap)
        /*
        sayi1=10    sayi1=20

        sayi2=20    sayi2=10
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. degeri giriniz : ");
        int sayi1= scan.nextInt();   //10
        System.out.println("Lutfen 2. degeri giriniz : ");
        int sayi2= scan.nextInt();  // 20
        int bosKova=0;
        bosKova=sayi1;  // boskova=10
        sayi1=sayi2;    // sayi1= 20
        sayi2=bosKova;   // sayi2=10

        System.out.println("sayi1 : "+sayi1+"\nsayi2 : "+sayi2);



    }
}
