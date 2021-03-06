package edu.javacourse.spring.rest;

import java.util.Date;

/**
 * @author Artem Pronchakov <artem.pronchakov@calisto.email>
 */
public class User {

    private Long id;
    private String name;
    private Date birth;

    public User(Long id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
