package com.tavisca.dataconversion.model;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String email;
    private String address;
    private int deptId;

    public Employee(){

    }

    public Employee(int id, String name, String email, String address,int deptId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
