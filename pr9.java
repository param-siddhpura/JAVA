import java.util.*;

//Simple interest calculation

public class pr9 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Float p,r,t;
    System.out.println("Enter P:-");
    p=s.nextFloat();
    System.out.println("Enter R:-");  
    r=s.nextFloat();
    System.out.println("Enter T:-");
    t=s.nextFloat();
    Float i = (p*r*t)/100;
    System.out.println("Simple Interest:-" + i);

  }
  
}
