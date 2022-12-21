package Arrays;

public class C04_elemanArama {
    public static void main(String[] args) {
        //  Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.
        int[] arr={1,5,7,1,2,5,1,6};
        int istenenEleman=5;
        System.out.println(elemanVarmiSayisi(arr,istenenEleman));
    }
    public static int elemanVarmiSayisi(int[] arr, int istenenEleman){
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenEleman){
                counter++;
            }
        }
        return counter;
    }
}
