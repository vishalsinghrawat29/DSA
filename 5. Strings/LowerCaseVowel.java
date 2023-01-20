public class LowerCaseVowel {
    public static void countLowerCaseVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch =='i'|| ch =='o'||ch =='u') {
                count++;
            }
        }
        System.out.println("Vowels Count: " + count);
    }
    public static void main(String[] args) {
        String str = "Vishal Singh Rawat";
        countLowerCaseVowel(str);
    }
}
