package it.arteprogrammazione.prove;

import java.io.Serializable;


public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = -5977809511766786065L;

    private Integer id;

    private String firstName;

    private String lastName;

    private String organization;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

}
