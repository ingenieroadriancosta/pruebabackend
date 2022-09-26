package com.nttdata.co.pruebabackend.dto;

import com.nttdata.co.pruebabackend.constants.ClientInfoInit;

public class ClientInfo {
    String firstName;
    String secondName;
    String firstSureName;
    String secondSureName;
    long phoneNumber;
    String address;
    String homeCity;

    public ClientInfo() {
        emptyAll();
    }

    public ClientInfo fillAll() {
        firstName = ClientInfoInit.FIRSTNAME;
        secondName = ClientInfoInit.SECONDNAME;
        firstSureName = ClientInfoInit.FIRSTSURENAME;
        secondSureName = ClientInfoInit.SECONDSURENAME;
        phoneNumber = ClientInfoInit.PHONENUMBER;
        address = ClientInfoInit.ADDRESS;
        homeCity = ClientInfoInit.HOMECITY;
        return this;
    }

    public void emptyAll() {
        firstName = "";
        secondName = "";
        firstSureName = "";
        secondSureName = "";
        phoneNumber = 0L;
        address = "";
        homeCity = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSureName() {
        return firstSureName;
    }

    public void setFirstSureName(String firstSureName) {
        this.firstSureName = firstSureName;
    }

    public String getSecondSureName() {
        return secondSureName;
    }

    public void setSecondSureName(String secondSureName) {
        this.secondSureName = secondSureName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

}
