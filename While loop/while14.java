import java.util.*;
// Sum of the digit in a given number using while loop
public class while14 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;

    while(n>0){
    int dig = n%10;
    sum += dig;
    n/=10;
    }
    
    System.out.println(sum);
  }
}
