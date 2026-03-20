import java.util.*;
// Factorial
public class pr26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to print its factorial:-");
    int n=s.nextInt();
    int fac=1;
    for(int i=0;i<n;i++){
      fac=fac*(n-i);
    }
    System.out.println(fac);
  }
}
