package İfStatements;

import java.util.Scanner;

public class Q4_İfEskenarUcgen {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc kenar uzunlugunu giriniz : ");
        double kenar1,kenar2, kenar3 = scan.nextDouble();
        kenar1= scan.nextDouble();
        kenar2= scan.nextDouble();
        kenar3= scan.nextDouble();
        if(kenar3==kenar1 && kenar3==kenar2 && kenar1==kenar2){
            System.out.println("Eskenar ucgen");
        }

    }
}
