public class function2 {
  public static void main(String[] args){
    pattern1();

    pattern2();

    pattern3();
  }

  public static int pattern1(){
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    } 
    return 1;
  }
  
  public static int pattern2(){
     System.out.println();    
    System.out.println("* ");
    System.out.println("* * ");
    System.out.println("* * * ");
    System.out.println("* * ");
    System.out.println("* ");          
    return 1;
  }
  
  public static int pattern3(){

    System.out.println();    
    System.out.println("* ");
    System.out.println("* * ");
    System.out.println("* * *");
    System.out.println("* * * *");
    System.out.println("* * * * *");          
    return 1;
 
  }
}
