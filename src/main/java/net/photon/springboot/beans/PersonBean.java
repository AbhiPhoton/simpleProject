package net.photon.springboot.beans;

import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component
public class PersonBean {

    private long personId;
    private String firstName;
    private String lastName;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
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
}
