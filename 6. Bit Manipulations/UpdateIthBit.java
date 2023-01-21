public class UpdateIthBit {
    public static int clearIBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int setIBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int updateIBit(int n, int i, int newBit){
        // if (newBit!=0) {
        //     return clearIBit(n, i);
        // } else {
        //     return  setIBit(n, i);
        // }

        n = clearIBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIBit(10, 2, 1));
    }
}
