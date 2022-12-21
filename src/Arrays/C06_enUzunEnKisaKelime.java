package Arrays;

public class C06_enUzunEnKisaKelime {
    public static void main(String[] args) {
        //  Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.
        String[] arr={"Sumeyra","Belkis","Tugba","Ali","Busra"};
    }
    public static void enUzunEnkisaKelime(String[] arr){
        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()<enUzunKelime.length())
                enUzunKelime=arr[i];

        }
    }

}
