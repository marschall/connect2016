package com.github.marschall.connect2016;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class DateValidator {

  private DateValidator() {
    throw new AssertionError("not instantiable");
  }

  /**
   * Checks if the given input is in the format month day ({@code "MMdd"})
   * eg. {@code "1027"} for October 27th.
   *
   * @param s the input, not {@code null}
   * @return if the input is the expected format
   */
  public static boolean isValidMonthDay(String s) {
    SimpleDateFormat format = new SimpleDateFormat("MMdd");
    format.setLenient(false);
    try {
      format.parse(s);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }

}
