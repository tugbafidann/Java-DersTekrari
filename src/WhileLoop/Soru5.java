package WhileLoop;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi=scan.nextInt();
        System.out.println("Lutfen hesaplamak istediginiz üs bilgisini girin : ");
        int us=scan.nextInt();
        int carpim=1;
        while (us>0){
            carpim=sayi*carpim;
            us--;
        }
        System.out.println(carpim);
    }
}
