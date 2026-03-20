import java.util.Scanner;

//Calculate Grade 

public class pr16 {
  public static void main (String[] args){
    Scanner s= new Scanner(System.in);
Float mark;
System.out.println("Enter your marks:- ");
mark =s.nextFloat();

if (mark>=90 && mark<100){
  System.out.println("Excellent");
}
  else if (mark>=80 && mark<90){
       System.out.println("Very Good");
  }
      else if(mark>=66 && mark<80){
          System.out.println("Good");
      }
          else if(mark>=33 && mark<66){
              System.out.println("Pass");               
          }
          else{
              System.out.println("Fail");
          }
  }
          
}
