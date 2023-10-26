package one_single_inheritance;

/**
 * Dalam pewarisan tunggal, subkelas mewarisi fitur dari satu subkelas
 * kelas super. Pada gambar di bawah, kelas A berfungsi sebagai kelas dasar
 * kelas turunan B.
 */
public class AnimalsApp {
  public static void main(String[] args) {
    Dog pitbull = new Dog();
    pitbull.eat();
    pitbull.bark();
  }
}
