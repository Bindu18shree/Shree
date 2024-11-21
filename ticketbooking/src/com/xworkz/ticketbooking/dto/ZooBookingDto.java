package com.xworkz.ticketbooking.dto;

public class ZooBookingDto {

    private String customerName;
    private String email;
    private long mobileNo;
    private int noOfTickets;

    public ZooBookingDto(String customerName, long mobileNo, int noOfTickets) {
        this.customerName = customerName;
        this.mobileNo = mobileNo;
        this.noOfTickets = noOfTickets;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
