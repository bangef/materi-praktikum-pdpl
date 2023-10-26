package five_final_class;

public class Car extends Vehicle { // error
  private String type;
  private String model;

  public Car(String fuelType, String type, String model) {
    super(fuelType);
    this.type = type;
    this.model = model;
  }

  @Override
  public String toString() {
    return "Car [type=" + this.type + ", model=" + this.model + "]";
  }
}
