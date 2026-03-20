import java.util.*;
// Reverse the digits in a given number using while loop
public class while12 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    int rev = 0;
    while(n>0){
      int dig = n%10;
      rev = rev*10 + dig ;
      n/=10;
    }
    System.out.println("Reversed Number is "+rev);
  }
}
