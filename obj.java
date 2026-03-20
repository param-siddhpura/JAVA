import java.util.*;
// Object class in java
class obj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:-");
        String name = s.nextLine();
        System.out.println("Enter the age:-");
        int age = s.nextInt();
        Person p1 = new Person(name, age);
        System.out.println(p1);
    }
}