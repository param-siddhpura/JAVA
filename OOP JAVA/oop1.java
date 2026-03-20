// Instance Variabl and Instance Method
import java.util.*;                                              // Importing Package

class Student1{                                                   // Class

  int num;                                                       // Instance Variable 
  String name;
  
  void show(){                                                   // Instance Method
    System.out.println("Name of student is "+name);
    System.out.println("Roll number of student is "+num);
  }
}

public class oop1 {                                               // Main Class
  public static void main(String[] args) {                        // Main Method
    
    Scanner s = new Scanner(System.in);                           // Scanner Class Object 
    Student1 s1 = new Student1();                                   // Object

    System.out.println("Enter name of student");
    s1.name = s.nextLine();
    System.out.println("Enter roll number of student");
    s1.num = s.nextInt();

    s1.show();                                                  // Calling Instance Method
    s.close();  
  }
  
}
