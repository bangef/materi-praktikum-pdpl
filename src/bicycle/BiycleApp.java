package bicycle;

public class BiycleApp {
  public static void main(String[] args) {
    Bicycle bicycleOne = new Bicycle(5, 0);
    System.out.println(bicycleOne);
    bicycleOne.speedUp(10);
    System.out.println(bicycleOne);
    bicycleOne.applyBrake(5);
    System.out.println(bicycleOne);

    System.out.println();

    MountBike mountBikeOne = new MountBike(5, 0, 21);
    System.out.println(mountBikeOne);
    mountBikeOne.speedUp(20);
    System.out.println(mountBikeOne);
    mountBikeOne.applyBrake(5);
    System.out.println(mountBikeOne);
    mountBikeOne.setSeatHeight(45);
    System.out.println(mountBikeOne);
  }
}