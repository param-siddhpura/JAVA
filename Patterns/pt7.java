import java.util.*;
/* Pattern:-7  Inverted Pyramid Pattern
*********
 ******* 
  *****  
   ***   
    * 

*/

public class pt7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number:- ");
    int n = s.nextInt();

    System.out.println("*************************************** 1 ****************************************");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*(n-i)+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("*************************************** 2 ****************************************");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*(n-i)+1;j++){
        System.out.print(i);
      }
      System.out.println();
    }

    System.out.println("*************************************** 3 ****************************************");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*(n-i)+1;j++){
        System.out.print(j);
      }
      System.out.println();
    }

  }
}
