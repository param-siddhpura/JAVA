import java.util.*;
//Bitwise AND operation
public class pr18 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter First Number:-");
    int a= s.nextInt();
    System.out.println("Enter Second Number:-");
    int b= s.nextInt();

    int finalResult= a & b;
    System.out.println("Final result is :- "+ finalResult);
  }
  
}
