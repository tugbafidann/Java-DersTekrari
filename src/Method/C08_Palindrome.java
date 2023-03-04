package Method;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan
         String str="Sümeyra";
         String tersStr=C07_TerseCevirme.terseCevirme(str);
        System.out.println(tersStr);
        if(tersStr.equals(str)){
            System.out.println("Kelime PALİNDROMEdir");
        }else System.out.println("Kelimme PALİNDROME DEĞİLDİR");



    }
}
