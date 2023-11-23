package praktikum.delapan.app.car;

public final class Car {
  private String brand;
  private String color;

  public Car(String brand, String color) {
    this.brand = brand;
    this.color = color;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", color=" + color + "]";
  }
}
