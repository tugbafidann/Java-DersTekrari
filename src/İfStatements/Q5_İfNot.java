package İfStatements;

import java.util.Scanner;

public class Q5_İfNot {
    public static void main(String[] args) {
        //  Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        int not= scan.nextInt();
        if (not>=50 ){
            System.out.println("Sinifi Gectin");
        } if (not<50 ){
            System.out.println("Maalesef kaldin");
        }

    }
}
