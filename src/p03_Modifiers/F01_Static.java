package p03_Modifiers;
class Student {
    String name;
    static int age = 45;
    static double cgpa = 3.80;
    static void StaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
}

public class F01_Static {
    public static void main (String[] args){
        System.out.println(Student.age);
        System.out.println(Student.cgpa);
        Student.StaticMethod();
    }
     
   }
