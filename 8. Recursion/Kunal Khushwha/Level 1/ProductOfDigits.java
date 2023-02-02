public class ProductOfDigits {    
public static int prodDigit(int n) {
    if (n%10 == n) {
        return n;
    }
    return (n%10)* prodDigit(n/10);
    
}
public static void main(String[] args) {
    System.out.println(prodDigit(1342));
}
}
