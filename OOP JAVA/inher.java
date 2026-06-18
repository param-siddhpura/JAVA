class db {
   int a = 10;
   int b = 20;

   void sum (int a, int b){
    System.out.println("The sum of a and b is:"+(a+b));
   } 

}
class demo extends db{
    int c = 25;
    void sum(int a, int c){
        System.out.println("Sum of a and c is:"+(a+c));
    }

}

public class inher {
    public static void main(String []x){
        db a = new db();
        a.sum(10, 20);
        db b = new demo();
        b.sum(10, 25);
    }
}