package İfStatements;

import java.util.Scanner;

public class Q3_SayiUcveBesBolum {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi= scan.nextInt();
        if (sayi%3==0){
            System.out.println("Sayi 3 ile bolunebilen sayi");
        }
        if (sayi%5==0){
            System.out.println("Sayi 5 ile bolunebilen sayi");
        }

    }
}
