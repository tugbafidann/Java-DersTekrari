package Scanner;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
       // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
       //  girilen bilgiler : J Doe, 44

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas= scan.nextInt();
        System.out.println(isim+", "+yas);
    }
}
