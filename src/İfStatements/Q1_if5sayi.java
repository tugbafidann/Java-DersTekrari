package İfStatements;

import java.util.Scanner;

public class Q1_if5sayi {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi= scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
    }
}
