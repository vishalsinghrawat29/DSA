public class ClearIthBit {
    public static int clearIBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBit(10, 1));
    }
}
