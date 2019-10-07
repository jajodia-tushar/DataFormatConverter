package com.tavisca.dataconversion.model;

import java.util.ArrayList;

public class Department {

    String deptName;
    int deptId;
    ArrayList<Employee> allEmployee;

    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public ArrayList<Employee> getAllEmployee() {
        return allEmployee;
    }

    public void setAllEmployee(ArrayList<Employee> allEmployee) {
        this.allEmployee = allEmployee;
    }
}
