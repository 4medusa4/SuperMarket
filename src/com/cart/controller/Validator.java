package com.cart.controller;

import com.cart.assest.model.DatePicker;
import java.sql.Date;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isNull(String str) {
        return str == null;
    }

    public static boolean isEmpty(String str) {
        return str.equals("");
    }

    public static boolean allDigits(String str) {
        return str.matches("^[0-9]{1,}$");
    }

    public static boolean allLetters(String str) {
        return !str.matches("^[a-zA-Z]{1,}$");
    }

    public static boolean isAlphanumeric(String str) {
        return str.matches("^[a-zA-Z0-9]{1,}$");
    }

    public static boolean isAlphaWithSpace(String str) {
        return str.matches("^([a-zA-Z]+\\s)*[a-zA-Z]+$");
    }
    
    public static boolean isAlphanumericWithSpace(String str) {
        return str.matches("^([a-zA-Z0-9]+\\s)*[a-zA-Z0-9]+$");
    }

    public static boolean isNullDate(DatePicker picker) {
        try {
            Date.valueOf(picker.getDatePicker().getModel().getValue().toString());
            return false;
        } catch (NullPointerException e) {
            return true;
        }
    }

    public static boolean checkDateForEarly(DatePicker picker) {
        Date dob = Date.valueOf(picker.getDatePicker().getModel().getValue().toString());
        return !dob.before(java.sql.Date.valueOf(LocalDate.now()));
    }
    
    public static boolean checkDateForEarlyOrTodays(DatePicker picker) {
        Date dob = Date.valueOf(picker.getDatePicker().getModel().getValue().toString());
        return dob.after(java.sql.Date.valueOf(LocalDate.now()));
    }

    public static boolean checkLength(String str, int len) {
        return str.length() >= len;
    }

    public static boolean haveSymbols(String str) {
        return str.matches("[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]$");
    }

    public static boolean isPriceVerified(String str) {
        Pattern e = Pattern.compile("^\\d+(.\\d{1,2})?$");
        return e.matcher(str).matches();
    }
    
    public static boolean isDiscountRateVarified(String str) {
        Pattern e = Pattern.compile("^\\d{1,2}+(.\\d{1,2})?$");
        return e.matcher(str).matches();
    }

    public static boolean isEmailVerified(String str) {
        Pattern e = Pattern.compile("^[a-zA-Z0-9\\._-]+@[a-zA-Z0-9\\.-]+\\.[a-zA-Z]{2,4}$");
        return !e.matcher(str).matches();
    }

    public static boolean isPhoneVerified(String str) {
        Pattern p = Pattern.compile("^(?:0|\\+94)?[1-9][0-9]{8}$");
        return !p.matcher(str).matches();
    }

    public static boolean isAddressVerified(String str) {
        return str.matches("^([a-zA-Z0-9/,\\.]+\\s)*[a-zA-Z0-9/,]+$");
    }
    
    public static boolean isSelectedIndex(int index) {
        return index < 1;
    }
}
