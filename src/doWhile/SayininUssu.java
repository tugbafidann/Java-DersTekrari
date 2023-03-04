package doWhile;

import java.util.Scanner;

public class SayininUssu {
    /*
      Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
       */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi=scan.nextInt();
        System.out.println("Lutfen hesaplamak istediginiz üs bilgisini girin : ");
        int us=scan.nextInt();
        usHesaplama(sayi,us);
    }
    public  static void  usHesaplama(int sayi,int us){
        int adet=0;
        int carpim=1;
        if (us==0 && sayi!=0) System.out.println(sayi+" nin " + us+" ussu= 1 dir");
        else if (us==0 && sayi==0) System.out.println("Tanimsizdir");
        else if(us >0) {
            do{
                carpim*=sayi;
                adet++;
            }while (adet<us);
            System.out.println(sayi+" nin " + us+" ussu " + carpim);
        } else if (us<0) {
            do{
                carpim*=sayi;
                adet--;
            }while (adet>us);
            System.out.println(sayi+" nin " + us+" ussu= 1/ " + carpim);


        }

    }


}
