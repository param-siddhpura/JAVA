import java.util.*;
// Find factorial for given nummber using while loop 
public class while9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = s.nextInt();
    int i = 1;
    int fac=1;
    while(i<=n){
      fac = fac * i;
      i++;
    }
    System.out.println("factorial :- "+ fac);
  }
}