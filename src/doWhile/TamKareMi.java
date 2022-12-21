package doWhile;

public class TamKareMi {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4

        int sayi=144;
        int kareKok=1;
        boolean sonuc=false;

        do {
            if(kareKok*kareKok==sayi){
                System.out.println("Sayinin karekoku : "+kareKok);
                sonuc=true;
                break;
            }else {
                kareKok++;
            }
        }while (kareKok*kareKok<=sayi);
        System.out.println(sonuc);


    }
}
