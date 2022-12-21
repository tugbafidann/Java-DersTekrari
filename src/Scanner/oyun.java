package Scanner;

import java.util.Random;
import java.util.Scanner;

public class oyun {
    public static void main(String[] args) {
        /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi=0;
        int sayac=0;

        while (!(tutulanSayi==sayi)){

            sayi=scan.nextInt();
            if(sayi>tutulanSayi){
                System.out.println("Lutfen sayinizi kucultun");
            } else if(sayi<tutulanSayi){
                System.out.println("Lutfen sayinizi buyultun");
            }
            sayac ++;
        }
        if(sayac<=3){
            System.out.println("Vaoww");
        } else if(sayac>=4 && sayac<=8) {
            System.out.println("Aferin");
        }else {
            System.out.println("Başarısiz");
        }


    }
}
