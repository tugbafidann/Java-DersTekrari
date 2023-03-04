package ForLoop;

import java.util.Scanner;

public class C09_10_TerseCevirme {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
kaydedin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz ");
        String kelime= scan.nextLine();
        String tersKelime="";
        for (int i =kelime.length()-1; i >= 0; i--) {
            tersKelime +=kelime.substring(i,i+1);

        }
        System.out.println(tersKelime);
    }
}
