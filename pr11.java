import java.util.*;
//Ferenhit to Celsius conversion
public class pr11 {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Float f,c;
    System.out.println("Enter temperature in Ferenhit:-");
    f=s.nextFloat();
    c=(f-32)*5/9;
    System.out.println("Temperature in Celsius:-" + c);
  }
}