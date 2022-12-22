package SwitchCaseStatements;

import java.util.Scanner;

public class Q06_Mevsim {
    public static void main(String[] args) {
        // Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int aylar= scan.nextInt();
        switch (aylar){
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Kis mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar Mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            default:
                System.out.println("Girdiginiz sayida ay ve mevsim bulunmamaktadir");
        }


    }
}
