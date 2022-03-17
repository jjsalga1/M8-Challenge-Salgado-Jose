package com.company;

public class Customer {
    private Person information;

    private Address shippingAddress;
    private Address billingAddress;

    private boolean rewardsMember;

    public Customer(Person information, Address shippingAddress, Address billingAddress, boolean rewardsMember) {
        this.information = information;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardsMember = rewardsMember;
    }

    public Person getInformation() {
        return information;
    }

    public void setInformation(Person information) {
        this.information = information;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }
}
