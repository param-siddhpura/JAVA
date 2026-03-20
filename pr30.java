import java.util.*;

//Reverse given number

public class pr30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to reverse:- ");
    int num = s.nextInt();
    int reverse = reverse(num);
    System.out.println("Reverse number is "+reverse);

  }

  public static int reverse(int num){
    int newNum=0;
    while(num >0){
      int digit =num % 10;
      newNum = newNum * 10 + digit ;
      num/=10; 
    }
    return newNum;
  }
}
