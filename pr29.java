import java.util.*; 
// Check given number is prime or not
public class pr29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number to check whether it is prime or not:-");
    int n = s.nextInt();
    if(n <=1 || n%2 ==0 && n!=2){
      System.out.println( n+ " isn't a prime number.");
    }
    else{
       System.out.println(n+ " is a prime number.");
    }
  }
}
 