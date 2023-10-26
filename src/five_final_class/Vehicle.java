package five_final_class;

final public class Vehicle {
  private String fuelType;

  Vehicle(String fuelType) {
    this.fuelType = fuelType;
  }

  void startEngine() {
    System.out.println("bruumm...");
  }
}
