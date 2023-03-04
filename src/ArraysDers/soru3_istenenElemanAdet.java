package ArraysDers;

public class soru3_istenenElemanAdet {
    public static void main(String[] args) {
        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        int[] arr={3,5,6,8,3,2,5,3,3,5,2,7};
        int istenenEleman=1;
        elemanAra(arr,istenenEleman);
    }
    public static void elemanAra(int[] arr,int istenenEleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (istenenEleman == arr[i]) {
                sayac++; // 2
            }
        }
        if(sayac==0)
            System.out.println("İstenen eleman bulunmamaktadır");
        else System.out.println("istenen eleman "+sayac+" kere  kullanılmıstır");
    }

    }


