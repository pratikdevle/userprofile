package com.example.userprofile.model;

/**
 * Represents a user profile with an ID, name, and email.
 */
public class User {

    private String id;
    private String name;
    private String email;
    private String country;

    /**
     * Default constructor for creating an empty User object.
     */
    public User() {
    }

    /**
     * Constructs a User object with the specified parameters.
     *
     * @param id      the unique identifier of the user
     * @param name    the name of the user
     * @param email   the email address of the user
     * @param country the country of the user
     */
    public User(String id, String name, String email, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
    }

    /**
     * Gets the unique identifier of the user.
     *
     * @return the user's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the user.
     *
     * @param id the user's ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the user.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name the user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email address of the user.
     *
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Gets the country of the user.
     *
     * @return the user's country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the user.
     *
     * @param country the user's country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}