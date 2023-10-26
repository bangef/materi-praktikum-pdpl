package bicycle;

public class Bicycle {
  private int gear;
  private int speed;

  public Bicycle(int gear, int speed) {
    this.gear = gear;
    this.speed = speed;
  }

  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }

  public void speedUp(int increment) {
    this.speed += increment;
  }

  @Override
  public String toString() {
    return "\nNo of gears are " + this.gear + "\n" + "speed of bicycle is " + this.speed;
  }
}