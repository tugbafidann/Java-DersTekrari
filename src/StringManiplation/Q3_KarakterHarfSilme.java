package StringManiplation;

public class Q3_KarakterHarfSilme {
    public static void main(String[] args) {
        // Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.
       // String str="java1 ogRe2@nMek3 #ne +Gu=zel";
        /*String sayi=str.replaceAll("1","").replaceAll("2","")
                .replaceAll("3","");
        String bosluk=sayi.replaceAll(" ","1");
        String karakter=bosluk.replaceAll("\\W","");
        bosluk=karakter.replaceAll("1"," ");
        String harf=bosluk.substring(0,1).toUpperCase()+bosluk    .substring(1).toLowerCase();
        System.out.println(harf);

         */
        /*
        \\s : space \\S : space olmayan hersey
\\s+    \\s+: yanyana birden fazla space
\\d     \\d: digits \\D : digit olmayan hersey
\\w      \\w: harf veya rakam \\W : harf veya rakam olmayan hersey
         */
        String str="aeü4 üaü-üa ei7üa+üa";
        String karakter=str.replaceAll(" ","0"); // java10ogRe2@nMek30#ne0+Gu=zel
        karakter=karakter.replaceAll("\\W",""); //java10ogRe2nMek30ne0Guzel
        karakter=karakter.replaceAll("0"," "); //java1 ogRe2nMek3 ne Guzel
        karakter=karakter.replaceAll("\\d",""); //java ogRenMek ne Guzel
        System.out.println(karakter.substring(0,1).toUpperCase()
                .concat(karakter.substring(1).toLowerCase()));






    }
}
