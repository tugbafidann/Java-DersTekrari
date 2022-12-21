package İfStatements;

import java.util.Scanner;

public class Q10_IfElseBuyukKucukCevir {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf=scan.next().toUpperCase().charAt(0);
        if (harf>='a'&& harf<='z'){
            System.out.println(harf);
        }else {
            System.out.println(harf);
        }
    }
}
