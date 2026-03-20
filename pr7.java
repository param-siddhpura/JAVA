import java.util.Scanner;
public class pr7 {
  public static void main(String[] args){
    int length , breadth;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter length of rectangle:");
    length = s.nextInt();
    System.out.println("Enter breadth of rectangle:");
    breadth = s.nextInt();
    int perimeter = 2 * (length + breadth);
    System.out.println("Perimeter of rectangle= " + perimeter);
  }
}
