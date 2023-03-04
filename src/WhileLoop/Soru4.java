package WhileLoop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen toplamak icin tamsayi girin" +
                "\nBitirmek icin 0'a basin");
        int girilenSayi=1;
        int toplam=0;
        while (girilenSayi!=0){
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }
        System.out.println("girilen sayilarin toplami : "+toplam);
    }
}
