package Arrays;

public class C02_pozitifSayi {
    public static void main(String[] args) {
        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int[] arr={-1,3,5,-9,10};
        System.out.println(pozitifSayilarToplam(arr));
    }
    public static int pozitifSayilarToplam(int[] arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0)
                toplam+=arr[i];
        }
     return toplam;
    }
}
