package dev.naman.models;

// S of Design Principles. SOLID Design Principle
// Single Responsibility Pronciple
// Single Repsonsibility of the model classes should be to store the attributes of
// the model.
public class User extends BaseModel {
    private String name;
    private String phoneNo;
    private String hashedPassword;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Bcrypt

// Restaurant
// Client -> Waiter ->        Chef ->     Kitchen/ Refrigerator -> INgredients
// Client.   Controller.      Services.   Database (Repository).   Models
// package by feature
// package by functionality
