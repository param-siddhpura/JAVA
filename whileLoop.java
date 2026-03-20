import java.util.*;

public class whileLoop {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a number:-"); 
    int n=s.nextInt();
    int i=30; // Initialization
    while(i>=n){  // Condition
      System.out.println("Num:- " +i);
      i--; //Updation
    }

    
  }
}
