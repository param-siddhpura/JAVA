/* Pattetn 1:-
* 
* *
* * *
* * * *
* * * * *  
*/
import java.util.*;

public class pt1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of rows:- ");
    int n = s.nextInt();

    System.out.println("\n*************************************   1   ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print("* ");

      }
      System.out.println();
    }

    System.out.println("\n*************************************   2   ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" " +i);
        
      }
      System.out.println();
    }
  
System.out.println("\n*************************************   3   ****************************************** \n");

for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+j);
        
      }
      System.out.println();
    }

System.out.println("\n*************************************   4  ****************************************** \n");
 
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+(i*i));
        
      }
      System.out.println();
    }

System.out.println("\n*************************************   5  ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+(j*j));
        
      }
      System.out.println();
    }

System.out.println("\n*************************************   6  ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+(i*j));
        
      }
      System.out.println();
    }

  System.out.println("\n*************************************   7  ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+(i*2));
        
      }
      System.out.println();
    }

  System.out.println("\n*************************************   8  ****************************************** \n");

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){

        System.out.print(" "+(j*2));
        
      }
      System.out.println();
    }
     
  }
}
