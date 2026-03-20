import java.util.*;
// Fibonacci series using while loop
public class while19 {
  public static void main(String[] args) {
    int num , first = 0, second = 1, next, i = 0;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    while(i < num){
      if(i == 0){
        System.out.println(first);
      }
      else if(i == 1){
        System.out.println(second);
      }
      else{
        next = first + second;
        System.out.println(next);
        first = second;
        second = next;
      }
      i++;
    }
  }
}
