import java.util.Scanner;

public class BasicStrings{
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str1= "abcde";
        String str2 = new String("xyz");

        System.out.println(str1);
        System.out.println(str2);
        Scanner sc =  new Scanner(System.in);

        // single word 
        String name, name1;
        name = sc.next();
        System.out.println(name);

        // whole line
        name1 = sc.nextLine();
        System.out.println(name1);
        sc.close();
    }
}