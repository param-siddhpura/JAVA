// Use of super Keyword 

class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String color = "Black";

    void display() {
        System.out.println(super.color); // parent class variable
        super.eat(); // parent class method
    }
}

public class oop3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
