package dev.codescreen;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCalculatorTest {

  @Test
  public void test1() {
    Assert.assertEquals(0, FibonacciCalculator.calculate(0));
  }

  @Test
  public void test2() {
    Assert.assertEquals(5, FibonacciCalculator.calculate(5));
  }

  @Test
  public void test3() {
    Assert.assertEquals(6765, FibonacciCalculator.calculate(20));
  }

  @Test
  public void test4() {
    Assert.assertEquals(75025, FibonacciCalculator.calculate(25));
  }
}
