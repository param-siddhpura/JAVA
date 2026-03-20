import java.util.*;

public class pr6 {
  public static void main(String[] args){
    int a , b;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number a:");
    a = s.nextInt();
    System.out.println("Enter second number b:");
    b = s.nextInt();
    System.out.println("Sum= " +(a+b));
    System.out.println("Difference= "+(a-b));
    System.out.println("Product= "+(a*b));
    System.out.println("Quotient= "+(a/b));
  }
}
