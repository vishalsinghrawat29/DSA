public class ClassesAndObjects{
    public static void main(String[] args) {
            Pen p1 = new Pen();
            p1.setColor("blue");
            System.out.println(p1.color);
            p1.setTip(5);
            System.out.println(p1.tip);
            p1.color = "yellow";
            System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chm){
        percentage = (phy + math +chm)/3;
    }
}