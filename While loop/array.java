import java.util.*;
//Display Array elements
public class array {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Size of array:-");
    int i = s.nextInt();
    int[] a= new int[i];
    for(int j=0;j<i;j++){
      System.out.println("Enter the element:- \t");
      a[j] = s.nextInt();
    }
    for(int j=0;j<i;j++){
      System.out.println("a["+j+"]= "+a[j]);
    }
  }
}