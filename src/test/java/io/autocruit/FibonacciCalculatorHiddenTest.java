/*
 * Copyright (C) 2018 - present by AUTOCRUIT LIMITED
 *
 * Please see distribution for license.
 */
package io.autocruit;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCalculatorHiddenTest {

  @Test
  public void testHidden_1() {
    Assert.assertEquals(FibonacciCalculator.calculate(14), 377);
  }

  @Test
  public void testHidden_2() {
    Assert.assertEquals(FibonacciCalculator.calculate(15), 610);
  }

  @Test
  public void testHidden_3() {
    Assert.assertEquals(FibonacciCalculator.calculate(18), 2584);
  }

  @Test
  public void testHidden_4() {
    Assert.assertEquals(FibonacciCalculator.calculate(19), 4181);
  }
}
