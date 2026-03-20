import java.util.*;
//Sum of Array elements
public class pr35 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter array size:-\t");
    int n = s.nextInt();
    int[] a =new int[n];
    int sum = 0;
    for(int i=0;i<n;i++){
      System.out.println("Enter element ["+i+"]:- \t");
      a[i] = s.nextInt();
      sum = sum + a[i];
    }
    System.out.println("Sum of array elements is:- "+sum);
  }
}
