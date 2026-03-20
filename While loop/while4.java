import java.util.*;
// Print odd numbers using a while loop
public class while4{
  public static void main(String[] args) {
    int i = 1;
    while(i<=100){
      if(i%2==1){
        System.out.println(i);
      }//loop stop at 1 
      i++;
    }
  }
}