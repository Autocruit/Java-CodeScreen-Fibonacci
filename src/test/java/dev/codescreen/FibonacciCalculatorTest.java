package dev.codescreen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciCalculatorTest {

  @Test
  public void test1() {
    assertEquals(0, FibonacciCalculator.calculate(0));
  }

  @Test
  public void test2() {
    assertEquals(5, FibonacciCalculator.calculate(5));
  }

  @Test
  public void test3() {
    assertEquals(6765, FibonacciCalculator.calculate(20));
  }

  @Test
  public void test4() {
    assertEquals(75025, FibonacciCalculator.calculate(25));
  }

}
