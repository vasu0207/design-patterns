package structural.bridge_pattern;

public class Bike extends Vehicle {
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacturer() {
        System.out.println("Bike.manufacturer");
        workshop1.work();
        workshop2.work();
    }
}
