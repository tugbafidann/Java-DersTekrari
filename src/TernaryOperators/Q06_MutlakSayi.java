package TernaryOperators;

import java.util.Scanner;

public class Q06_MutlakSayi {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi= scan.nextInt();
        System.out.println(sayi>0 ? sayi : (sayi*(-1)));
    }
}
