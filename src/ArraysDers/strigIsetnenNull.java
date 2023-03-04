package ArraysDers;

import java.util.Arrays;

public class strigIsetnenNull {
    public static void main(String[] args) {
        /*
        Verilen bir String array'de
        istenen bir harfi iceren kelimeleri silip, yerine null yazdirin
         */
        String[] isimler={"Tuğba","Ragıp","Sümeyra"};
        String harf="r";
        for (int i = 0; i <isimler.length ; i++) {
            if(isimler[i].contains(harf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler));


    }
}
