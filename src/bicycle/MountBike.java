package bicycle;

public class MountBike extends Bicycle {
  private int seatHeight;

  public MountBike(int gear, int speed, int seatHeight) {
    super(gear, speed);
    this.seatHeight = seatHeight;
  }

  public void setSeatHeight(int newValue) {
    this.seatHeight = newValue;
  }

  @Override
  public String toString() {
    String superToString = super.toString();
    return superToString + "\nseat height is " + seatHeight;
  }
}
