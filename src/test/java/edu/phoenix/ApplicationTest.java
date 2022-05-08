package edu.phoenix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
  @Test
  void shouldMap() {
    var expected = Map.of(1, "One", 2, "Two");
    var actual = Application.mapFromJsonb(Application.mapToJsonb(expected));
    assertEquals(expected, actual);
  }
}
