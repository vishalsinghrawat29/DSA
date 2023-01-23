public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammal m1= new Mammal();
        m1.eat();
        m1.breathe();
        m1.walk();

        Fish f1= new Fish();
        f1.eat();
        f1.breathe();
        f1.swim();


        Birds b1= new Birds();
        b1.eat();
        b1.breathe();
        b1.fly();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("flying");
    }
}