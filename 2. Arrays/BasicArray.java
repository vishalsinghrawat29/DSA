import java.util.Scanner;

public class BasicArray{

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        int percentage = (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("Percentage: "+ percentage);

        System.out.println("Length of array: "+ marks.length);

        update(marks);
        for (int i = 0; i < marks.length; i++) {
           System.out.print(marks[i] + " ");
        }
        System.out.println();
        sc.close();


    }
}