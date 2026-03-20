import java.util.*;
// Armstrong number

public class pr31 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter a number: ");
    int n = s.nextInt();
    int temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      sum = sum + (digit * digit * digit);
      temp = temp / 10;
    }
    if (sum == n) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not an Armstrong number because Sum is " +sum);
    }
  }
}
