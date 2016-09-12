package com.github.marschall.connect2016;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.github.marschall.connect2016.DateValidator.isValidDateMonth;

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

    assertFalse(isValidDateMonth("1131"));
  }

}
