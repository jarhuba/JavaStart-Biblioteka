package com.javastart.biblioteka.data;

import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 3187078139801519107L;

    private String firstName;
    private String lastName;
    private String pesel;

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
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    //CONSTRUCTOR
    public User(String firstName, String lastName, String pesel) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    //METHODS
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (pesel == null) {
            if (other.pesel != null)
                return false;
        } else if (!pesel.equals(other.pesel))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + pesel;
    }
}
