import java.util.*;
//sum of odd numbers

public class pr25 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter number:-");
    int n=s.nextInt();
    int sum=0;
    for(int i=0;i<=n;i++){
      if(i%2==1){
        sum+=i;
      }
    }
    System.out.println("Sum of odd numbers upto "+n+" is: "+sum);
  }
}
