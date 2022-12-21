package IfElseStatements;

import java.util.Scanner;

public class Q04_MesafeKm {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        // 1km=1000 m
        // 1km=100000 cm
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen km olarak mesafeyi giriniz : ");
        double km= scan.nextDouble();
        System.out.println("Cevirmek istediginiz birimi(cm veya m ) giriniz : ");
        String birim= scan.next();
        if (birim.equalsIgnoreCase("cm")){
            System.out.println("Cevrilmis : "+(km*1000));
        } else if (birim.equalsIgnoreCase("m")) {
            System.out.println("Cevrilmis : "+(km*100000));
        }else System.out.println("Istediginiz birim sisteme kayitli degil");

    }
}
