// Interface in Java


interface shape {
    void area();
}

class clcArea implements shape {
    public void area(){
        System.out.println("Area of shape is 100 m^2.");
    }
}


public class intrfc {
   public static void main(String[] x){
    clcArea c = new clcArea();
    c.area();
   } 
}
