import java.util.*;
// Square of each number upto n using while loop
public class while21 {
  public static void main(String[] args) {
    int n, i = 1;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    while(i <= n){
      System.out.println(i*i);
      i++;
    }
  }
}