public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        Beer b =new Beer();
        b.eatGrass();
        b.eatMeat();
    }
}
interface Herbivore{
    void eatGrass();
}
interface Carnivore{
    void eatMeat();
}

class Beer implements Herbivore, Carnivore{
    public void eatMeat(){
        System.out.println("eat meat");
    }
    public void eatGrass(){
        System.out.println("eat grass");
    }  
}
