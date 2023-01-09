public class ThreeLargest {
    public static void main(String[] args) {
        int a=1, b=3, c=6;
        if(a>=b && a>=c){
            System.out.println("a is Largest");
        }else if(a>=c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    }
}
