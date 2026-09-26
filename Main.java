class student{
  int id;
  String name;
  String Dept;
  float cgpa;
  student(int id ,String name , String Dept, float cgpa){
    this.id = id;
    this.name = name;
    this.Dept = Dept;
    this.cgpa = cgpa;
  }
  void info(){
    System.out.println("Student ID: " + this.id);
    System.out.println("Name: " + this.name);
    System.out.println("Department: " + this.Dept);
    System.out.println("Student ID: " + this.cgpa);
  }
  void updatecgpa(float newCgpa){
    cgpa= newCgpa;
    System.out.println("Updated CGPA:" +cgpa);
    }
  
  void scolarship(){
    if(this.cgpa>3.50){
        System.out.println("Scolarship CGPA: Yes");
    }
    else{
        System.out.println("Scolarship CGPA: No");
    }
  }
}

public class Main{
    public static void main(String [] args){
        student s1 = new student(001,"SIUM","SWE",3.75f);
        s1.info();
        s1.updatecgpa(3.99f);
        s1.scolarship();
        
    }
}