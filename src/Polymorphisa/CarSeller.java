package Polymorphisa;

public class CarSeller {
    public static void main(String[] args) {
        // overloading: ayni isim farkli signuture ile ayni class da birden fazla
        // method olusturmamiza imkan tanir

        CarSeller obj1=new CarSeller();
        obj1.yakit();
       // obj1.yakit(4.5);
       // obj1.yakit(2023);
       //  obj1.yakit(2023,5.4);



        // overriding: parent class'da vor olan bir method'un child class'da
        // olusturulan ayni isim ve siğnuture sahep bir method tarafindan gecersiz
        // kilinmasidir

        Toyota obj2=new Toyota();
        obj2.yakit();

        Toyota obj3=new ToyotaBenzinli();
        obj3.yakit();

        Toyota obj4=new ToyotaDizel();
        obj4.yakit();

        Toyota obj5=new ToyotaElektirikli();
        obj5.yakit();



    }
        public void motor(){
            System.out.println("Musteri nasıl motor isterse, bulunur ");
        }
        public void yakit(){
            System.out.println("Mustari hangi yakit isterse bulunur");
        }

    public void yakit(double maxTuketim){
        System.out.println("Istetiginiz "+maxTuketim+" Lt tuketime uygun arac buluruz");
    }
    public void yakit(int yil){
        System.out.println("Istedginiz model yili "+ yil +" Sartlarina uygun arac bulunur");
    }
    public void yakit(int yil, double maxTuketim){
        System.out.println("Istediginiz "+ yil+ " ve " +maxTuketim+" uygun arac bulunur ");
    }

}
