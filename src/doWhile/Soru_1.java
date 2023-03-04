package doWhile;

public class Soru_1 {
    public static void main(String[] args) {
       //  Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
        char baslangic='k';
        char bitis='t';
        do {
            System.out.print(baslangic+" ");
            baslangic=(char)(baslangic+1);
        }while (baslangic<=bitis);

    }
}
