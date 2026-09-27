class A {
    int id;
    String name;
}
class B extends A {
    String university;

    B(int id, String name, String university) {
        this.id = id;
        this.name = name;
        this.university = university;
    }

    void display() {
        System.out.println(id + " " + name + " " + university);
    }
}
class C extends A {
    String department;

    C(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println(id + " " + name + " " + department);
    }
}
public class HierarchicalInheritence {
    public static void main(String[] args) {

        B s1 = new B(001, "SIUM", "DIU");
        C s2 = new C(031, "LABIB", "SWE");
        s1.display();
        s2.display();
    }
}