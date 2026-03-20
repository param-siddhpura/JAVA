import java.util.*;

public class while20 {
  public static void main(String[] args) {
    int num, fir=0 , sec=1 , sum=0;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    while(sum<=num){
      System.out.println(fir+" ");
      int next = fir + sec;
      fir = sec;
      sec = next;
      sum = sum + fir;
    }
    System.out.println("Sum of Fibonacci series is: "+sum);
  }  
}
