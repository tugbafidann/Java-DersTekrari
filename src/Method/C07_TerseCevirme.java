package Method;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        // verilen bir stringi terse cevirip
        // o halini bize donduren bir method olusturun
        String str="ragıp";
        System.out.println(terseCevirme(str));
    }
    public static String terseCevirme(String str){
        String strTersi="";
        for (int i = str.length()-1; i >= 0; i--) {
            strTersi +=str.charAt(i);

        }
        return strTersi;
    }

}
