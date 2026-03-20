import java.util.*;
// Print sum of all even n numbers using a while loop
public class while8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = s.nextInt();
    int i = 1;
    int sum=0;
    while(i<=n){
      if(i%2==0){
      sum += i;
      i++;
      }
      else 
        i++;
    }
    System.out.println("Sum:- "+ sum);
  }
}