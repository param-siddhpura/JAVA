import java.util.*;
//print prime numbers upto n numbers using while loop
public class while18 {
  public static void main(String[] args) {
    int count = 0;
    int i = 1;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while( i <= n){
      count=0;
      int j=1;
      while(j<=i/2){
        if(i%j==0){
          count++;
        }
        j++;
      }
      if(count==1){
        System.out.println(i);
      }
      i++;
    }
  }
}
