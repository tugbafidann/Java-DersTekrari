package İfStatements;

import java.util.Scanner;

public class Q6_IfElseEskenarUcgen {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if(kenar3==kenar1 && kenar3==kenar2 && kenar1==kenar2){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }


    }
}
