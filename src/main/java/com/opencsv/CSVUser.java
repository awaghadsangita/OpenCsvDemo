package com.opencsv;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
    @CsvBindByName
    private String name;
    @CsvBindByName(column = "email", required = true)
    private String email;
    @CsvBindByName(column = "phone")
    private String phone;
    @CsvBindByName
    private String country;
//    public CSVUser(String name, String email, String phone, String country) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.country = country;
//    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phoneNo) {
        this.phone = phoneNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
