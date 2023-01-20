import java.util.Arrays;

public class Anagram {
    public static void isAnagram(String str1,String str2){
        str1 =str1.toLowerCase();
        str2 =str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str1.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            if (Arrays.equals(str1CharArray, str2CharArray)) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }else{
                System.out.println(str1 + " and " + str2 + "are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + "are not anagram.");
        }
    }
    public static void main(String[] args) {
     String str1 = "care";
     String str2 = "race";
     isAnagram(str1, str2);
    }
}
