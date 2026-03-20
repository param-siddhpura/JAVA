import java.util.*;

//Area of triangle

public class pr8 {
  public static void main(String[] args){
    float a,b;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter base of triangle:-");
    a=s.nextFloat();
    System.out.println("Enter height of triangle:-");
    b=s.nextFloat();
    float area = 0.5f * (a*b) ;
    System.out.println("Area of triangle:-" + area);
  }
}
