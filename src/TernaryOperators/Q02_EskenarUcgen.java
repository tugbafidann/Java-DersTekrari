package TernaryOperators;

import java.util.Scanner;

public class Q02_EskenarUcgen {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        System.out.println((kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar1)
                           ? " Eskenar ucgen"
                           : " Eskenar ucgen degil");
    }
}
