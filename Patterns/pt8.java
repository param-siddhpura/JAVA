/* Pattern:- 8 Diamond Pattern 

    *
   ***
  *****
 *******
  *****
   ***
    *
    
*/
import java.util.*;
public class pt8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number:- ");
    int n = s.nextInt();
  // Upper Half 
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i+1;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  // Lower Half
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*(n-i)+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();



  /*  * at Border of Diamond

     *
    * *
   *   *
   *   *
    * *
     *
     
     */
   // Upper Half 
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i+1;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==2*i-1){
          System.out.print("*");
        }else{
          System.out.print(" ");  
        }
    
      }
      System.out.println();
    }
  // Lower Half
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*(n-i)+1;j++){
        if(j==1 || j==2*(n-i)+1){
          System.out.print("*");
        }else{
        System.out.print(" ");
        }
      }
      System.out.println();
    }
 s.close();
  }
}
