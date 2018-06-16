package com.wuwix.domain;

import javax.persistence.*;

@Entity
public class AddressRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String locality;

    private String zipCode;

    private String street;

    private int streetNumber;

    public long getId() {
        return id;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}

