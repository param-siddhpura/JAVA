import java.util.*;
// Plaindrome Numberusing while Loop
public class while13 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int original = s.nextInt();
    int n = original;
    int rev = 0;
    while(n>0){
      int dig = n%10;
      rev = rev*10 + dig;
      n/=10;
    }

  if(original==rev){
      System.out.println("Plaindrome Number");
  }
   else{
      System.out.println("Not a Plaindrome Number");
   }
    
  }
}
