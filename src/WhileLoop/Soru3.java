package WhileLoop;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun.
         */
        String str="Hayat guzel";
        String strTers=strTersi(str);
        System.out.println(strTers);
    }
  public static String strTersi(String str){
        String tersStr="";
        int index=str.length()-1;
        while (index>=0){
            tersStr+=str.substring(index,index+1);
            index--;

        }
        return tersStr;
    }


 /*  public static String stringiTersCevir(String str) {

       String tersStr="";
       int index=str.length()-1;

       while(index>=0){
           tersStr+=str.substring(index,index+1);
           index--;
       }

       return tersStr;

  */
   }


