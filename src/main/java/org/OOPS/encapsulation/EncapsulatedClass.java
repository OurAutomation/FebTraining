package org.OOPS.encapsulation;

public class EncapsulatedClass {
    private String firstName;
    private String lastName;
    private String middleName;

    private String loginName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLoginName(String loginName) {
        this.loginName=loginName;

    }

    public boolean getUserStatus() {
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


}
