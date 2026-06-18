abstract class Car {
    abstract void on();
    abstract void off();
}

class myCar extends Car {
    void on(){
        System.out.println("Car started");
    }
    void off(){
        System.out.println("Car stopped");
    }
}

public class abr{
    public static void main(String[] x){
        myCar c = new myCar();
        c.on();
        c.off();
        
    }
}
