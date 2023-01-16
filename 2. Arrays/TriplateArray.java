// ----------Do that program after reading array list -------------------

public class TriplateArray {
    public static int[] threeSumArray(int numbers[]){
        int triplet[];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    for (int k = j+1; k < numbers.length; k++) {
                        int temp[];
                        if (numbers[i] + numbers[j] + numbers[k] == 0) {
                            
                            temp[0] = numbers[i];
                            temp[1] = numbers[j];
                            temp[2] = numbers[k];
                        }
                    }
                }
            }
    }
    public static void main(String[] args) {
        
    }
}
