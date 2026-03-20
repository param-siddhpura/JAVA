import java.util.*;
// Armstrong Number using while Loop
public class while15 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int original = s.nextInt();
    int n = original;
    int sum = 0, count = 0;
    int temp = n;
    while(temp<=0){
      temp/=10;
      count++;
    }
    
    temp=n;
    while(temp!=0){
      int dig = temp%10;
      sum += Math.pow(dig, count);
      temp/=10;
    }

  if(sum==original){
      System.out.println("Armstrong Number");
  }
   else{
      System.out.println("Not an Armstrong Number");
   }
   
   

  }

}
