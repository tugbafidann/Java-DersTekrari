package ForLoop;

public class TerseCevirme1 {
    public static void main(String[] args) {
        // Soru 10(interview) - Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin
        String str="Java ogrenmek icin cok calismak lazim";
        String tersString="";
        for (int i = str.length()-1; i >=0 ; i--) {

            tersString=str.substring(i,i+1);
            System.out.print(tersString);

        }

    }
}
