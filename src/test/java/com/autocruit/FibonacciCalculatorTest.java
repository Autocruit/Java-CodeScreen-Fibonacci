/*
 * Copyright (C) 2018 - present by AUTOCRUIT LIMITED
 *
 * Please see distribution for license.
 */
package com.autocruit;

import org.junit.Assert;
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
