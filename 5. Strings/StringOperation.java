public class StringOperation {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String Length
        String fullName = "Vishal Singh Rawat";
        System.out.println(fullName.length());

        //String Concatenation
        String firstName = "Vishal Singh";
        String lastName = "Rawat";
        String fullName1 = firstName + " " + lastName;
        System.out.println(fullName1);

        //charAt method
        System.out.println(fullName1.charAt(0));
        System.out.println(fullName1.charAt(1));

        // Print all Character of String 
        printLetters(fullName1);
    }
}
