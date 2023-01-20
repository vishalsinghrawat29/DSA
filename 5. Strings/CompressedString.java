public class CompressedString {
    // Using noraml String
    public static String compress(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
                newStr+= count.toString();
            }
        }
        return newStr;
    }

    // Using String Builder
    public static String compressStringBuilder(String str){
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count>1) {
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String str1 = "abcd";
        System.out.println(compress(str));
        System.out.println(compress(str1));
        System.out.println(compressStringBuilder(str));
        System.out.println(compressStringBuilder(str1));
    }
}
