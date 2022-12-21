package Scanner;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
       short yas= scan.nextShort();
        System.out.println("Lutfen boyunuzu giriniz : ");
        double boy= scan.nextDouble();
        System.out.println("isiminiz : "+isim+
                           "\nYasiniz :"+yas+
                            "\n Boy : "+boy);
    }

}
