public class SkipCharacter {
    public static void skipChar(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            skipChar(str.substring(1), ans);
        } else {
            skipChar(str.substring(1), ans+ch);
        }
    }
    public static void main(String[] args) {
        skipChar("baccdadf", "");
    }
}
