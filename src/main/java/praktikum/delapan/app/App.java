package praktikum.delapan.app;

import java.util.Calendar;

import praktikum.delapan.app.abc.ABC;
import praktikum.delapan.app.car.Car;
import praktikum.delapan.app.employee.EmployeeModel;
import praktikum.delapan.app.mysingleton.MySingleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
         * Immutable Object
         * The immutable objects adalah objek yang nilainya tidak dapat diubah setelah
         * inisialisasi
         */
        // Car car = new Car("Mobilio", "black");
        // EmployeeModel employeeModel = new EmployeeModel("Ficri", "Hanip", "12121",
        // "Jalan Sitijau Lewik", car);
        // System.out.println(employeeModel);

        /*
         * Singleton and Lazy or Eager Instance
         */
        // MySingleton singleton1 = MySingleton.getInstance();
        // MySingleton singleton2 = MySingleton.getInstance();
        // MySingleton singleton3 = MySingleton.getInstance();
        // Boolean isSingleton1EqualsSingleton2 = singleton1.equals(singleton2);
        // Boolean isSingleton2EqualsSingleton3 = singleton2.equals(singleton3);
        // Boolean isSingleton1EqualsSingleton3 = singleton1.equals(singleton3);
        // System.out.println(isSingleton1EqualsSingleton2);
        // System.out.println(isSingleton2EqualsSingleton3);
        // System.out.println(isSingleton1EqualsSingleton3);

        /*
         * Shallow and Deep Copy
         */

        // ABC obj1 = new ABC();
        // System.out.println("=== BEFORE SHALLOW COPY ===");
        // System.out.println("Object 1: " + obj1.x);
        // ABC obj2 = obj1;
        // System.out.println("Object 2: " + obj2.x);
        // System.out.println("=== AFTER SHALLOW COPY ===");
        // obj2.x = 45;
        // System.out.println("Object 1: " + obj1.x);
        // System.out.println("Object 2: " + obj2.x);

        // ABC obj1 = new ABC();
        // ABC obj2 = new ABC();
        // System.out.println("=== BEFORE DEEP COPY ===");
        // System.out.println("Object 1: " + obj1.x);
        // System.out.println("Object 2: " + obj2.x);
        // obj2.x = 45;
        // System.out.println("=== AFTER DEEP COPY ===");
        // System.out.println("Object 1: " + obj1.x);
        // System.out.println("Object 2: " + obj2.x);
    }
}
