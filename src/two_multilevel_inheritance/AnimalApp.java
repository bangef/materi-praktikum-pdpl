package two_multilevel_inheritance;

public class AnimalApp {
  public static void main(String[] args) {
    Dog pitbull = new Dog();
    pitbull.eat();
    pitbull.bark();

    BabyDog babyPitbull = new BabyDog();
    babyPitbull.eat();
    babyPitbull.bark();
    babyPitbull.weep();

    // pitbull.weep();
  }
}
