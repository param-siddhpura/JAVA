import  java.util.Scanner;
//Print numbers between a and b that are divisible by 7 using While loop
public class while23 {
  public static void main(String[] args) {
    int a, b;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();
    while(a <= b){
      if(a % 7 == 0){
        System.out.println(a);
      }
      a++;
    }
}
}