package praktikum.delapan.app.mysingleton;

/*
 * Eager :
 * 1. clean code
 * 2. Ini memiliki jeda waktu yang kecil ketika aplikasi berada dalam mode eksekusi karena semuanya sudah dimuat di memori.
 */
public class MySingleton {
  private static MySingleton singleton = new MySingleton();

  private MySingleton() {
    System.out.println("Object created...");
  }

  public static MySingleton getInstance() {
    return singleton;
  }
}

/*
 * Lazy:
 * 1. Aplikasi lebih cepat untuk memulai (dibandingkan dengan inisialisasi
 * eager).
 */
// public class MySingleton {
// private static MySingleton singleton;

// private MySingleton() {
// }

// public static MySingleton getInstance() {
// if (singleton == null) {
// singleton = new MySingleton();
// System.out.println("Object created...");
// }
// return singleton;
// }
// }
