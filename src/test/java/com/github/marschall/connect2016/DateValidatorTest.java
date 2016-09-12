package com.github.marschall.connect2016;

import static com.github.marschall.connect2016.DateValidator.isValidDateMonth;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DateValidatorTest {

  @Test
  public void validDateMonths() {
    assertTrue(isValidDateMonth("0101"));
    assertTrue(isValidDateMonth("0131"));

    assertTrue(isValidDateMonth("1201"));
    assertTrue(isValidDateMonth("1231"));

    assertTrue(isValidDateMonth("1130"));
  }

  @Test
  public void invalidDateMonths() {
    assertFalse(isValidDateMonth("JAN01"));

    assertFalse(isValidDateMonth("11"));

    assertFalse(isValidDateMonth("0001"));
    assertFalse(isValidDateMonth("0100"));
    assertFalse(isValidDateMonth("0132"));

    assertFalse(isValidDateMonth("1200"));
    assertFalse(isValidDateMonth("1232"));
    assertFalse(isValidDateMonth("1301"));

    assertFalse(isValidDateMonth("1131"));
  }

}
