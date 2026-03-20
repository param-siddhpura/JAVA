import java.util.*;

// Calculate sum of the digits of a number

public class pr27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to calculate sum of its digits:");
    int n = s.nextInt();
    int sum = 0 ;   
    while(n > 0) {
     sum = sum + (n % 10) ;
     n = n / 10;
    }
    System.out.println("Sum of digits: " + sum);
  }  
}
