package creational.builder_pattern;

public interface CarBuilder {
    public void buildCarType(String carType);
    public void buildEngine(String engine);
    public void buildFuelType(String fuelType);
    public void buildPower(Integer engine);
    public Car getCar();
}
