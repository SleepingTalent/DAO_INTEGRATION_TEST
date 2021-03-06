package com.noveria.humanResources.view.address;

import com.noveria.humanResources.model.address.entities.Address;

public class AddressViewBean {

    private String houseNumber;
    private String addressFirstLine;
    private String addressSecondLine;
    private String townCity;
    private String postCode;

    public AddressViewBean(String houseNumber, String addressFirstLine, String addressSecondLine, String townCity, String postCode) {
        this.houseNumber = houseNumber;
        this.addressFirstLine = addressFirstLine;
        this.addressSecondLine = addressSecondLine;
        this.townCity = townCity;
        this.postCode = postCode;
    }

    public AddressViewBean(Address address) {
        this(address.getHouseNumber(),
                address.getAddressFirstLine(),
                address.getAddressSecondLine(),
                address.getTownCity(),
                address.getPostCode());
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getAddressFirstLine() {
        return addressFirstLine;
    }

    public String getAddressSecondLine() {
        return addressSecondLine;
    }

    public String getTownCity() {
        return townCity;
    }

    public String getPostCode() {
        return postCode;
    }
}