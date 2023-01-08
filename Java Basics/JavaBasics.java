import java.util.*;

public class JavaBasics{
    public static void main(String[] args) {
        byte b = 8;
        char ch = 'a';
        boolean var =  false;
        float price =  10.5f;
        int number = 25;
        short m= 270;
        System.out.println(b);
        System.out.println(ch);
        System.out.println(var);
        System.out.println(price);
        System.out.println(number);
        System.out.println(m);
        System.out.println("Vishal");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}

/*
-----Boiler Plate in Java ---- 

public class JavaBasics{
    public static void main(String[] args) {
        
    }
}

------For Output------
System.out.print("Vishal");
System.out.println("Vishal");
System.out.print("Vishal\n");

------ Variables ----- 
PRIMITIVE DATA TYPE
byte - 1 bytes
short - 2 bytes
char - 2 bytes
boolean - 1 bytes
int - 4 bytes
long - 8 bytes
float - 4 bytes
double - 8 bytes

NON-PRIMITIVE DATA TYPE
String
Array
Class
Object
Interface


------ Type of Input Function ----- 
next()
nextInt()
nextLine()
nextFloat()
nextByte()
nextDouble()
nextBoolean()
nextShort()
nextLong()

*/