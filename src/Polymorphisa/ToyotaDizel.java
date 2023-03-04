package Polymorphisa;

public class ToyotaDizel extends Toyota{
    public void motor(){
        System.out.println("Toyota Dizel araclar 1.6 dizel motor kullanır");
    }
    public void yakit(){
        System.out.println("Toyota Dizel araclar EuroDizel yakit kullanirlar");
    }
    public void yakit(String renk){
        System.out.println("Toyota Dizel araclar 3 renkte uretilmistir");
        if (renk.equalsIgnoreCase("beyaz")||
            renk.equalsIgnoreCase("siyah")||
            renk.equalsIgnoreCase("mavi")){
            System.out.println("istediginiz renkte dizel Toyota bulunmaktir");
        }else {
            System.out.println("istediginiz renkte dizel Toyota bulunmamaktadir");
        }
    }
}
