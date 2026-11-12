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
        //if statements for null or empty entries
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
        //if statements for null or empty entries
    }

    public static String format(String fullName) {
        String[] newName;
        String firstName;
        String middleName;
        String lastName;
        String suffix = "";

        newName = fullName.split(" ");
        firstName = newName[0] + newName[1];
        middleName = newName[2];
        lastName = newName[3];
        // still need to account for missing pieces of the names (switch case?)
        int length = newName.length;
        if (fullName.contains(",")) {
            String[] nameParts = fullName.split(",");
            suffix = nameParts[1];
            fullName = lastName + "," + firstName + " " + middleName + ", " + suffix;
        }
        else {
            switch(newName.length) {
                case 4 -> {
                    fullName =  lastName + "," + firstName + " " + middleName;
                }
                case 3 -> {
                    fullName =  lastName + ", " + firstName;
                }
                default -> System.out.println("error");
            }

        }

        return fullName;

    }


}
