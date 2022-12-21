package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_pozitifSayi {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriiniz : ");
        int girilenSayi= scan.nextInt();
        if(girilenSayi<=0){
            System.out.println("Geçersiz Sayi");
        }else {
            List<Integer> tamBolenlerListesi=tamSayiBolenleriOlustur(girilenSayi);
            System.out.println(tamBolenlerListesi);
        }
    }
    public static List<Integer> tamSayiBolenleriOlustur(int girilenSayi){
        List<Integer> tamBolenlerListsesi=new ArrayList<>();
        for (int i = 1; i <girilenSayi ; i++) {
            if (girilenSayi%i==0){
                tamBolenlerListsesi.add(i);
            }
        }
        return tamBolenlerListsesi;
    }

}
