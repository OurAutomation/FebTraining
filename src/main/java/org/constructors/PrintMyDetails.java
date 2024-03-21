package org.constructors;

public class PrintMyDetails {
    String firstName;
    String lastName;

    //Default Constructor
    public PrintMyDetails() {
        System.out.println("Constructor called");
    }
    public PrintMyDetails(String str) {
        System.out.println("Constructor " + str);
    }

    public PrintMyDetails(String firstName, String lastName, String locationName) {
//        this();
        this("abc");
        //super(); super("abc");
        this.firstName=firstName;
        this.lastName=lastName;
        this.locationName=locationName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    String locationName;
}
