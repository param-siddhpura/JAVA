import java.util.*;
// Find Largest among Three Numbers
public class pr14 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    float a,b,c;
    System.out.println("Enter value of a:-");
    a=s.nextFloat();
    System.out.println("Enter value of a:-");
    b=s.nextFloat();
    System.out.println("Enter value of a:-");
    c=s.nextFloat();
    if(a>b && a>c){
      System.out.println(a+ " is Largest Number.");
    }
    else if(b>c && b>a){
      System.out.println(b+ " is Largest Number.");
    }
    else{
      System.out.println(c+ " is Largest Number.");
    }
  }
}