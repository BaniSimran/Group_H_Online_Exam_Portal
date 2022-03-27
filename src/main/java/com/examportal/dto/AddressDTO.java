package com.examportal.dto;

import com.examportal.entity.Address;

public class AddressDTO {
    private Long addrId;
    private String city;
    private String state;
    private String country;
    private Long zip;

    public AddressDTO() {
    }
    public AddressDTO(Address address) {
        this.addrId = address.getAddrId();
        this.city = address.getCity();
        this.country = address.getCountry();
        this.state = address.getState();
        this.zip = address.getZip();
    }

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }
}
