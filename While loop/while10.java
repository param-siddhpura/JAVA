import java.util.*;
// Find product of given nummber using while loop 
public class while10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = s.nextInt();
    int i =1 ;
    int prd=1;
    while(i<=n){
      int dig = n%10;
      n/=10;
      prd = prd * dig;
      i++;
    }
    System.out.println("Product:- "+ prd);
  }
}