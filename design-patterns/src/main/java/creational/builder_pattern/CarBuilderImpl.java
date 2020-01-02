package creational.builder_pattern;

public class CarBuilderImpl implements CarBuilder {
    Car car = new Car();

    public void buildCarType(String carType) {
      car.setCarType(carType);
    }

    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

    public void buildFuelType(String fuelType) {
        car.setFuelType(fuelType);
    }

    public void buildPower(Integer power) {
      car.setPower(power);
    }

    @Override
    public Car getCar(){
        return car;
    }

}
