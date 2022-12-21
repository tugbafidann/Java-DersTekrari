package Arrays;

import java.util.Arrays;

public class C07_elemanEkleme {
    public static void main(String[] args) {
        //  Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.
        int[] arr={2,5,7,8,10,25};
        int eklenecekEleman=10;
        System.out.println(Arrays.toString(arrayeElemanEkle(arr,eklenecekEleman)));
    }
    public static int[] arrayeElemanEkle(int[] arr,int ekelenecekEleman){
        int[] yeniArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=ekelenecekEleman;
        return yeniArr;
    }
}
