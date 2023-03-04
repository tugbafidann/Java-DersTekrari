package Polymorphisa;

public class ToyotaBenzinli extends Toyota{
    public void motor(){
        System.out.println("Toyota Benzinli araclar 1.4");
    }
    public void yakit(){
        System.out.println("Toyota Benzinli araclar E10 benzin kullanir");
    }
    public void yakit(Double maxTuketim){
        System.out.println("Toyota Benzinli araclar ortalama 6.8 lt benzin kullanilir");
        if(maxTuketim>6.8){
            System.out.println("Benzinli bir Toyota alabilirsiniz ");
        }else {
            System.out.println("İstediginize uygun benzinli bir Toyota bulamazsiniz");
        }
    }
}
