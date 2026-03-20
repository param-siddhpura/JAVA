// Use of this keyword in constructor and method
import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name; // 'this.name' = object variable
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class oop2 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        Student s1 = new Student(name);
        s1.display();
        s.close();
    }
}