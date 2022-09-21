package com.example.codechallenge.codechallenges;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author juan.yee
 */
public class CodeChallenge26 {
    public static void main(String[] args) {
        System.out.println(isValid("1990-01-01"));
    }

    private static boolean isValid(String date) throws Exception {
        DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        try {
            sdf.parse(date);
        } catch (Exception e) {
            throw new Exception("");
        }
        return true;
    }

//    @Override
//    public void validate(Object employeeObject, Errors errors) {
//        Employee e = (Employee) employeeObject;
//
//        if (e.getFullName() == null || e.getFullName().isEmpty()) {
//            //errors.reject("The fullName is a mandatory field");
//            //errors.rejectValue("fullName", "The fullName is a mandatory field");
//            errors.reject("fullName", "The fullName is a mandatory field");
//        }
//
//        if (e.getMobileNumber() == null || String.valueOf(e.getMobileNumber()).length()<10) {
//            errors.reject("The mobileNumber is a mandatory field");
//        }
//
//        if (e.getEmailId() == null || e.getEmailId().isEmpty()) {
//            errors.reject("The emailId is a mandatory field");
//        }
//
//        if (!e.getEmailId().contains("@")) {
//            errors.reject("The emailId should be in a valid email format");
//        }
//
//        if (e.getDateOfBirth() == null || e.getDateOfBirth().isEmpty()) {
//            errors.reject("The dateOfBirth is a mandatory field");
//        }
//
//        if (!isValid(e.getDateOfBirth())) {
//            errors.reject("The dateOfBirth should be in YYYY-MM-DD format");
//        }
//    }
//
//    private boolean isValid(String date) {
//        DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
//        try {
//            sdf.parse(date);
//        } catch (ParseException e) {
//            return false;
//        }
//        return true;
//    }
}
