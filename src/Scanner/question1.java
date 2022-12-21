package Scanner;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //Soru - 1:  Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas= scan.nextInt();
        System.out.println("Lutfen boyunuzu virgüllü olarak giriniz : ");
        double boy=scan.nextDouble();
        System.out.println("İsminiz : "+isim +
                           "\nYasiniz : "+yas+
                           "\nBoyunuz :"+boy);


    }
}
