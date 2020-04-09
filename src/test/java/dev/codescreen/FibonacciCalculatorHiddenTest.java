package dev.codescreen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciCalculatorHiddenTest {

  @Test
  public void testHidden1() {
    assertEquals(377, FibonacciCalculator.calculate(14));
  }

  @Test
  public void testHidden2() {
    assertEquals(610, FibonacciCalculator.calculate(15));
  }

  @Test
  public void testHidden3() {
    assertEquals(2584, FibonacciCalculator.calculate(18));
  }

  @Test
  public void testHidden4() {
    assertEquals(4181, FibonacciCalculator.calculate(19));
  }

}
