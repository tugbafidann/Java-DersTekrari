package İfStatements;

import java.util.Scanner;

public class Q8_IfElseEmekli {
    public static void main(String[] args) {
        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas= scan.nextInt();
        if(yas>=65) System.out.println("Emekli olabilirsin");
        else{
            System.out.println(((65 - yas) + " yıl calismaniz gerekiyor"));
        }

    }
}
