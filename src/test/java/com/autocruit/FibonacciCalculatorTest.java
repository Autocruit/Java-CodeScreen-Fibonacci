package com.autocruit;

import  org.junit.*;

import org.junit.Test;

public class FibonacciCalculatorTest {

  @Test
  public void test1() {
    Assert.assertEquals(FibonacciCalculator.calculate(0), 0);
  }

  @Test
  public void test2() {
    Assert.assertEquals(FibonacciCalculator.calculate(5), 5);
  }

  @Test
  public void test3() {
    Assert.assertEquals(FibonacciCalculator.calculate(20), 6765);
  }

  @Test
  public void test4() {
    Assert.assertEquals(FibonacciCalculator.calculate(25), 75025);
  }
}
