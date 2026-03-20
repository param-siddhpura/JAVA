import java.util.Scanner;
// Print all factors of a given number
public class while24 {
  public static void main(String[] args) {
    int num, i=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    System.out.println("Factors of " + num + " are: ");
    while(i <= num/2) {
      if(num % i == 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }
}
