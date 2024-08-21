import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void constructorOne() {
    Digits digits = new Digits(15704);
    assertEquals(5, digits.getDigitList().size());

    assertEquals(1, digits.getDigitList().get(0));
    assertEquals(5, digits.getDigitList().get(1));
    assertEquals(7, digits.getDigitList().get(2));
    assertEquals(0, digits.getDigitList().get(3));
    assertEquals(4, digits.getDigitList().get(4));
  }

  @Test
  void constructorTwo() {
    Digits digits = new Digits(1984);

    assertEquals(4, digits.getDigitList().size());
    assertEquals(1, digits.getDigitList().get(0));
    assertEquals(9, digits.getDigitList().get(1));
    assertEquals(8, digits.getDigitList().get(2));
    assertEquals(4, digits.getDigitList().get(3));
  }

  @Test
  void constructorThree() {
    Digits digits = new Digits(0);

    assertEquals(1, digits.getDigitList().size());
    assertEquals(0, digits.getDigitList().get(0));
  }

  @Test
  void constructorFour() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> new Digits(-1984));

    String expectedMessage = "The number passed to the constructor (-1984) cannot be negative!";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

  @Test
  void isStrictlyIncreasing() {
    assertTrue(new Digits(7).isStrictlyIncreasing());
    assertTrue(new Digits(1356).isStrictlyIncreasing());
    assertFalse(new Digits(1336).isStrictlyIncreasing());
    assertFalse(new Digits(1536).isStrictlyIncreasing());
    assertFalse(new Digits(65310).isStrictlyIncreasing());
  }
}