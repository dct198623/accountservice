package com.ghoomy.tata.accountservice.dto.request;

public class LoginRequestDTO {

    private String account;
    private String pwdHash;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwdHash() {
        return pwdHash;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

}
