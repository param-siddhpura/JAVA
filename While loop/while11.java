import java.util.*;
// Count the number of digits in a given number using while loop
public class while11 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    int count = 0;
    while(i<=n){
      if(n%i==0){
        n/=10;
        count++;
      }
      i++;
    }
    System.out.println(count);
  }
}
