import java.util.*;
//Multiplication table
class pr24 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number to print its multiplication table:-");
    int num=s.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num+" x "+i+" = "+(num*i));
    }
  
  }
}
