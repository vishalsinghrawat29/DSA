public class SuperKeyword {
    public static void main(String[] args) {
        Horse h =  new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("Horse Constructor called");
    }
}