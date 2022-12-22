package SwitchCaseStatements;

import java.util.Scanner;

public class Q05_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        //  Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gün numarasi giriniz : \n 1: Pazartesi 2: Sali 3:Carsamba 4: Persembe" +
                           "5: Cuma 6: Cumartesi 7: Pazar");
        int gunler= scan.nextInt();
        switch (gunler){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Girdiginiz gün haftaicidir");
                break;
            case 6:
            case 7:
                System.out.println("Girdiginiz gün haftasonudur");
                break;
            default:
                System.out.println("Girdiginiz sayida gün bulunmamaktadir");
        }
    }
}
