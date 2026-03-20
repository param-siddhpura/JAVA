import java.util.*;

//Simple interest calculation
//Compound interest calculation
public class pr10 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Float p,r,t;
    System.out.println("Enter P:-");
    p=s.nextFloat();
    System.out.println("Enter R:-");  
    r=s.nextFloat();
    System.out.println("Enter T:-");
    t=s.nextFloat();
    Float i = p*(1+r/100)*t;
    System.out.println("Simple Interest:-" + i);

  }
  
}