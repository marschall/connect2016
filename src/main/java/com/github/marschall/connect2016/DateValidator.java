package com.github.marschall.connect2016;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class DateValidator {

  private DateValidator() {
    throw new AssertionError("not instantiable");
  }

  public static boolean isValidDateMonth(String s) {
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
