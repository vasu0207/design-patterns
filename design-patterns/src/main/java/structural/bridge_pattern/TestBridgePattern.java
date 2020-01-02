package structural.bridge_pattern;

public class TestBridgePattern
{
    public static void main(String[] args) {
        System.out.println("Entered Main");
        Workshop w1 = new Assemble("Engine");
        Workshop w2 = new Assemble("Ceat");
        Vehicle vehicle = new Bike(w1, w2);
        vehicle.manufacturer();
        Vehicle vehicle1 = new Bike(w2,w1);
        vehicle1.manufacturer();
        System.out.println("Exist Main");
    }
}
