package ForLoop;

import java.util.Scanner;

public class C07_rakamlarToplari {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        /*int sayi= scan.nextInt();
        int toplam=0;
        for (int i = 0; 1 <=sayi ; i++) { //123
            toplam+=sayi%10; //3
            sayi=sayi/10;

        }
        System.out.println(toplam);

         */

        int sayi= scan.nextInt();
        String sayiStr= ""+sayi;
        int rakamlarToplami=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            rakamlarToplami= rakamlarToplami+sayi%10;
            sayi=sayi/10;
        }

        System.out.println(rakamlarToplami);



    }
}
