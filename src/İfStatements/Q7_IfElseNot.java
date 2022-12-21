package İfStatements;

import java.util.Scanner;

public class Q7_IfElseNot {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        int not= scan.nextInt();
        if (not>=50 ){
            System.out.println("Sinifi Gectin");
        } else{
            System.out.println("Maalesef kaldin");
        }
    }
}
