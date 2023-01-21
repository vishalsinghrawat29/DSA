public class SetIthBit {
    public static int setIBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIBit(10, 2));
    }
}
