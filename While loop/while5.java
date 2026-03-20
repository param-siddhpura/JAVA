import java.util.*;
// Print mulitiplication table using a while loop
public class while5{
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = s.nextInt();
    int i = 1;
    while(i<=10){
       System.out.println(n+" * "+i+" = "+(n*i));
      i++;
    }
  }
}
