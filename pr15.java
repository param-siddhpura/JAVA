import java.util.*;

// Find Leap Year

public class pr15 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int year;
    System.out.println("Enter a year:- ");
    year=s.nextInt();
    if(year%4==0){
      if(year%100==0){
        if(year%400==0){
          System.out.println(year+ " is a Leap year.");
        }
        else{
          System.out.println(year+ " isn't a Leap year.");
        }
      }
      else{
          System.out.println(year+ " isn't a Leap year.");
        }
      }
    else{
        System.out.println(year+ " isn't a Leap year.");
      }
    }

  }

