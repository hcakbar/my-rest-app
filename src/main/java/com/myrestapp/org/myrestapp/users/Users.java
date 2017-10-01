package com.myrestapp.org.myrestapp.users;

/**
 * Created by akbar on 9/30/2017.
 */
public class Users {

    private Integer id;
    private String firstName;
    private String getLastName;

    public Users() {

    }

    public Users(Integer id, String firstName, String getLastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.getLastName = getLastName;
    }

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

    public String getGetLastName() {
        return getLastName;
    }

    public void setGetLastName(String getLastName) {
        this.getLastName = getLastName;
    }


}
