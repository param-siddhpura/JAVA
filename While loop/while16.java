import java.util.*;
// Perfect Number using while Loop
public class while16 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    int sum = 0;
    while (i <= n / 2) {
      if (n % i == 0) {
        sum += i;
      }
      i++;
    }
    if (sum == n && n > 0) {
      System.out.println("Perfect Number");
    }
    else{
      System.out.println("Not a Perfect Number");
    }
     

    }

    
  }