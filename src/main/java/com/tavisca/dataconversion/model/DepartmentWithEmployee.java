package com.tavisca.dataconversion.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

import static com.tavisca.dataconversion.converter.JSONConverter.getJSONFormat;
import static com.tavisca.dataconversion.converter.JSONConverter.getJSONFormatWithOutFormat;

public class DepartmentWithEmployee {
    private String deptName;
    private int deptId;
    private String allEmployee;
    @JsonIgnore
    private ArrayList<AdvancedEmployee> allEmployeeList;

    public DepartmentWithEmployee(String deptName, int deptId, ArrayList<AdvancedEmployee> allEmployeeList) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.allEmployeeList = allEmployeeList;
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

    @JsonGetter("allEmployee")
    public String getAllEmployee() {
       return getJSONFormatWithOutFormat(this.allEmployeeList);
    }

    @JsonSetter("allEmployee")
    public void setAllEmployee(String allEmployee) {
        this.allEmployee = allEmployee;
    }

    public ArrayList<AdvancedEmployee> getAllEmployeeList() {
        return allEmployeeList;
    }

    public void setAllEmployeeList(ArrayList<AdvancedEmployee> allEmployeeList) {
        this.allEmployeeList = allEmployeeList;
    }
}
