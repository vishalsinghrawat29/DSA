public class StringFunction {
    public static String getsubString(String str, int Si, int Ei){
        String subStr = "";
        for (int i = Si; i < Ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        //String Compare
        String s1 = "Vishal";
        String s2 = "Vishal";
        String s3 = new String("Vishal");
        if(s1==s2){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not Equal");
        }

        if(s1==s3){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not Equal");
        }
        System.out.println(s1.equalsIgnoreCase(s3));
        //SubString
        String str = "Hello World";
        System.out.println(getsubString(str, 0, 5));
                //inBuild Function
        System.out.println(str.substring(0,5));

    }
}
