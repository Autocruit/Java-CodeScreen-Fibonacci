package dev.codescreen;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCalculatorHiddenTest {

  @Test
  public void testHidden_1() {
    Assert.assertEquals(377, FibonacciCalculator.calculate(14));
  }

  @Test
  public void testHidden_2() {
    Assert.assertEquals(610, FibonacciCalculator.calculate(15));
  }

  @Test
  public void testHidden_3() {
    Assert.assertEquals(2584, FibonacciCalculator.calculate(18));
  }

  @Test
  public void testHidden_4() {
    Assert.assertEquals(4181, FibonacciCalculator.calculate(19));
  }
}
