package SwitchCaseStatements;

import java.util.Scanner;

public class yuzler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi= scan.nextInt();
        int yuzler=sayi/100;
        System.out.println("yuzler "+yuzler);
        int onlar=sayi/10;
        System.out.println("Onlar : "+onlar);
        onlar=onlar%10;
        int birler=sayi%10;
        switch (yuzler) {
            case 1:
                System.out.print("Yüz ");
                break;
            case 2:
                System.out.print("İkiyüz ");
                break;
            case 3:
                System.out.print("Ücyüz ");
                break;
            case 4:
                System.out.print("Dörtyüz ");
                break;
            case 5:
                System.out.print("Besyüz ");
                break;
            case 6:
                System.out.print("Altiyüz ");
                break;
            case 7:
                System.out.print("Yediyüz ");
                break;
            case 8:
                System.out.print("Sekizyüz ");
                break;
            case 9:
                System.out.print("Dokuzyüz  ");
                break;
        }
        switch (onlar) {
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kirk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmis ");
                break;
            case 7:
                System.out.print("Yetmis ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;
        }
        switch (birler){
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Uc");
                break;
            case 4:
                System.out.print("Dort");
                break;
            case 5:
                System.out.print("Bes");
                break;
            case 6:
                System.out.print("Alti");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
        }
    }

}

