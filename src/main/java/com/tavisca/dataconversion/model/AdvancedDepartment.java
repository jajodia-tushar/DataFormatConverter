package com.tavisca.dataconversion.model;

public class AdvancedDepartment {

    String name;
    int deptId;

    public AdvancedDepartment() {
    }

    public AdvancedDepartment(String name, int deptId) {
        this.name = name;
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
