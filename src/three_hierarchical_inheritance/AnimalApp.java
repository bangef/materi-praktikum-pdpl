package three_hierarchical_inheritance;

public class AnimalApp {
  public static void main(String[] args) {
    Dog pitbull = new Dog();
    pitbull.eat();
    pitbull.bark();

    Cat cat = new Cat();
    cat.eat();
    cat.meow();
  }
}
