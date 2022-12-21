package Method;

public class FibonacciSayisi {
    public static void main(String[] args) {
        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........
  /*
  0+1 1
  1+1  2
  2+1  3
   */
    /* fibonacciSerisi(10);
    }
    public static void fibonacciSerisi(int adet){
        // Kullanıcı 0 negatif sayi girerse

        // 0 1 1 2 3 5 8
        if(adet<=0){
            System.out.println("Geçersiz giriş");
        } else if (adet==1) {
            System.out.println("0");
        } else if (adet==2) {
            System.out.println("0 1 ");
        }else{
            //  0      1        1
            int sayi1=0;
            int sayi2=1;
            int sayiToplam3=0;

            // kULLANİCİ 4 GİRERSE
            sayiToplam3=sayi1+sayi2;    // 0   1   1  2
            int sy1=1;    // sayi1=0
            int sy2=1;    // sayi2=1
            int sy3=2;   // sayi3=1

            // 5 girerse
            // 0 1 1 2 3
            sy1=1;   // sayi1=1
            sy2=2;  // sayi2=1
            sy3=3;   // sayi3=2

            int sayi4=sayi2+sayiToplam3;
            sayi2=sayi1;
        if(adet<=0){
            System.out.println("Geçersiz giriş");
        } else if (adet==1) {
            System.out.println("0");
        } else if (adet==2) {
            System.out.println("0 1 ");
        } else if (adet==3) {
            System.out.println("0 1 1");
        } else{
            //  0      1        1
            int sayi1=1;
            int sayi2=1;
            int sayiToplam3=0;
            for (int i = 4; i <=adet ; i++) {
                sayiToplam3=sayi1+sayi2;   // sayiToplam3= 1 + 1 =2
                System.out.print(sayiToplam3+" "); // 0   1           1           2                  3



                sayi1=sayi2;  // sayi1=1sayi1
                sayi2=sayiToplam3;








                // 0      1       1    2







            }
        }

*/
    }
}
