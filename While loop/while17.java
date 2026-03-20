import java.util.Scanner;
//Prime Number using while loop
public class while17 {
  public static void main(String[] args) {
    int count = 0;
    int i = 1;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while( i <= n/2){
      if(n%i==0){
        count++;
      }
      i++;
    }
    if(count==1){
      System.out.println("Prime Number");
    }
    else{
      System.out.println("Not a Prime Number");
    }
  }
}