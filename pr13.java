import java.util.*;
//Find Odd or Even number
public class pr13 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    float num;
    System.out.println("Enter a number:-");
    num=s.nextFloat();
    if(num%2==1){
      System.out.println(num+ " is Odd Number.");
    }
    else{
      System.out.println(num+ " is Even Number.");
    }
    
  }
}