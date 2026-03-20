import java.util.*;
// Print even numbers using a while loop
public class while3{
  public static void main(String[] args) {
    int i = 1;
    while(i<=100){
      if(i%2==0){
        System.out.println(i);
      }//loop stop at 1 
      i++;
    }
  }
}