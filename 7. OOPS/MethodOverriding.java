public class MethodOverriding {
    public static void main(String[] args) {
        Dear d =  new Dear();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat something...");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}