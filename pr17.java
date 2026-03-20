import java.util.*;

//Age group classification

public class pr17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = s.nextInt();

    if (age >= 0 && age <= 12) {
      System.out.println("Child");
    } else if (age >= 13 && age <= 19) {
      System.out.println("Teenager");
    } else if (age >= 20 && age <= 59) {
      System.out.println("Adult");
    } else if (age >= 60) {
      System.out.println("Senior Citizen");
    } else {
      System.out.println("Invalid age");
    }
  }
}