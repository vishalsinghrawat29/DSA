public class MaxSubArrayKadanes {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<0) {
                ms = 0;
            }else{
                cs = cs+numbers[i];
                if (cs<0) {
                cs = 0;
                }
                ms = Math.max(cs, ms);
            }
        }
        System.out.println("Max SubArray Sum is " + ms);
        
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,-4,-1,-2,-1,-5,3};
        kadanes(numbers);
    }
}
