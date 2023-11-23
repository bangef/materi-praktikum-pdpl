package praktikum.delapan.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import praktikum.delapan.mysingleton.MySingleton;

/**
 * Unit test for simple App.
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MySingletonTest {
  @Test
  void membandingkan_antar_object_singleton() {
    MySingleton singleton1 = MySingleton.getInstance();
    MySingleton singleton2 = MySingleton.getInstance();
    MySingleton singleton3 = MySingleton.getInstance();

    assertEquals(singleton1, singleton2);
    assertEquals(singleton1, singleton3);
    assertEquals(singleton2, singleton3);
  }
}
