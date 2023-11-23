package praktikum.delapan.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import praktikum.delapan.app.mysingleton.MySingleton;

/**
 * Unit test for simple App.
 */
@Tags({
    @Tag("mysingleton-test")
})
class TestMySingletonTest {
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
