package İfStatements;

import java.util.Scanner;

public class Q9_IfElseBuyukHarf {
    public static void main(String[] args) {
        //  Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz :");
        char harf=scan.next().charAt(0);
        if(harf>='A' && harf<='Z') {
            System.out.println("Buyuk harf");
        } else if (harf>='a' && harf<='z') {
            System.out.println("Kucuk harf");
        }else {
            System.out.println("Yanlıs giris");
        }
    }
}
