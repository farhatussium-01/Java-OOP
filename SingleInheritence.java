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

public class SingleInheritence {
    public static void main(String[] args) {
        B s = new B(001, "SIUM", "DIU");
        s.display();
    }
}