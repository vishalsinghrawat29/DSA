public class AddOneInteger {
    public static void increment(int n){
        System.out.println(n + "+1" + " is " + -~n );
    }
    public static void main(String[] args) {
        increment(6);
        increment(-4);
        increment(0);
    }
}
