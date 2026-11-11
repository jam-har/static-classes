package com.pluralsight;

public class NameFormatter {

    private String firstName;
    private String lastName;
    private String prefix;
    private String middleName;
    private String suffix;

    private NameFormatter() {

    }

    public static String format(String firstName, String lastName, String prefix, String middleName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + " " + suffix;
    }
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    /*public static String format(String fullName) {
        String newName;
        if ()
    }*/


}
