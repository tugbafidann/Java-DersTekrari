package JavaPractice.Day_1;

public class SayilariYazdirma {
    public static void main(String[] args) {
        //100'den 0'a kadar 13'e tam bölünebilen sayıları
        // ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
        int toplam=0;
        for (int i = 100; i >1 ; i--) {
            if(i%13==0){
               toplam +=i;
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("13 e bolunen sayilarin toplami : "+toplam);

        int sayi=0;
        while (sayi>0){

        }

    }
}
