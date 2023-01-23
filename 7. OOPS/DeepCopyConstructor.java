public class DeepCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vishal";
        s1.roll = 456;
        s1.password = "abcd";
        System.out.println("s1: " + s1.name + ", " + s1.roll + ", " + s1.password);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        for (int i = 0; i < 3; i++) {
            System.out.println("s1 marks " + i + ": " +s1.marks[i] );
        }


        // s1 forget password , now we create new object
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100; // Shallow copying - copy refrence variable
        System.out.println("s2: " + s2.name + ", " + s2.roll + ", " + s2.password);
        for (int i = 0; i < 3; i++) {
            System.out.println("s2 marks " + i + ": " +s2.marks[i] );
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // non-paramterized constructor
    Student(){
        marks = new int[3];
        System.out.println("Constructor called...");
    }

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
