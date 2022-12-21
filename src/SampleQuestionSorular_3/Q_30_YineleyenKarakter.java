package SampleQuestionSorular_3;

import java.util.Arrays;

public class Q_30_YineleyenKarakter {
    public static void main(String[] args) {
        // Soru 30-)
        //Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        //( mülakat sorusu )
        //Örnek:
        //String str="Javacokkolay"
        //Yinelenen karakterler : [a, o, k]
        //İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        //     Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra
        //     atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
        String str="ArtikJavaCokKolay";
        String yinelenenKarakter="";
        for (int i = 0; i <str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if ((str.charAt(i)==str.charAt(j))&& !yinelenenKarakter.contains(str.charAt(i)+"")){
                    yinelenenKarakter=yinelenenKarakter+str.charAt(i);
                }
            }
        }
        String[] karakterler=yinelenenKarakter.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
