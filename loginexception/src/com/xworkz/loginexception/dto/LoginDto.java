package com.xworkz.loginexception.dto;

public class LoginDto {

    private String userName;
    private String email;
    private long contactNumber;
    private String password;
    private int otp;

    public LoginDto(String userName, String email, long contactNumber, String password, int otp) {
        this.userName = userName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.password = password;
        this.otp = otp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
}
