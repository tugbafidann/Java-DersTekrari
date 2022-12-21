package Scanner;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz : ");
        double yariCap= scan.nextDouble();
        System.out.println("Cemberin Cevresi : "+(2*3.14*yariCap));
        System.out.println("Cemberin Alani   : "+3.14*(yariCap*yariCap));
    }

}
