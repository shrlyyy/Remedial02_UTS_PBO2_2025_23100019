/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author ASUS
 */
public class Customer {
    private String name;
    private Long phoneNumber;
    private String address;

    public Customer(String name, Long phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(Long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
