import java.util.*;
// Find +ve or -ver number
public class pr12 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    float num;
    System.out.println("Enter a number:-");
    num=s.nextFloat();
    if(num>0){
      System.out.println(num+ " is +Ve Number.");
    }
    else if(num<0){
      System.out.println(num+ " is -Ve Number.");
    }
    else{
      System.out.println("Number is Zero.");
    }
  }
}