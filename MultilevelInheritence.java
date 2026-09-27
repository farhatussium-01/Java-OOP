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

class C extends B {
    String department;

    C(int id, String name, String university, String department) {
        super(id, name, university);
        this.department = department;
    }

    void display() {
        System.out.println(id + " " + name + " " + university + " " + department);
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        C s = new C(001, "SIUM", "DIU", "SWE");
        s.display();
    }
}