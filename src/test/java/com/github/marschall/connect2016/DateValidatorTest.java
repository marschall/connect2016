package com.github.marschall.connect2016;

import static com.github.marschall.connect2016.DateValidator.isValidMonthDay;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DateValidatorTest {

  @Test
  public void validDateMonths() {
    assertTrue(isValidMonthDay("0101"));
    assertTrue(isValidMonthDay("0131"));

    assertTrue(isValidMonthDay("1201"));
    assertTrue(isValidMonthDay("1231"));

    assertTrue(isValidMonthDay("1130"));
  }

  @Test
  public void invalidDateMonths() {
    assertFalse(isValidMonthDay("JAN01"));

    assertFalse(isValidMonthDay("11"));

    assertFalse(isValidMonthDay("0001"));
    assertFalse(isValidMonthDay("0100"));
    assertFalse(isValidMonthDay("0132"));

    assertFalse(isValidMonthDay("1200"));
    assertFalse(isValidMonthDay("1232"));
    assertFalse(isValidMonthDay("1301"));

    assertFalse(isValidMonthDay("1131"));
  }

}
