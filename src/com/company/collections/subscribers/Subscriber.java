package com.company.collections.subscribers;

public class Subscriber {
    private String telephoneNumber;
    private String fullName;
    private String address;

    public Subscriber(String telephoneNumber, String fullName, String address) {
        this.telephoneNumber = telephoneNumber;
        this.fullName = fullName;
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
