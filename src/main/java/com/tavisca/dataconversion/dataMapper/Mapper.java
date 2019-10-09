package com.tavisca.dataconversion.dataMapper;

import com.tavisca.dataconversion.model.AdvancedDepartment;
import com.tavisca.dataconversion.model.AdvancedEmployee;
import com.tavisca.dataconversion.model.DepartmentWithEmployee;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Mapper {

    public static ArrayList<DepartmentWithEmployee> map(ArrayList<AdvancedDepartment> departments, ArrayList<AdvancedEmployee> employees){
        ArrayList<DepartmentWithEmployee> list = new ArrayList<>();
        departments.forEach((advancedDepartment -> {
            int deptId = advancedDepartment.getDeptId();
            ArrayList<AdvancedEmployee> allEmployee =(ArrayList<AdvancedEmployee>)employees.stream().filter((advancedEmployee) -> advancedEmployee.getDeptId() == deptId).collect(Collectors.toList());
            list.add(new DepartmentWithEmployee(advancedDepartment.getName(),advancedDepartment.getDeptId(),allEmployee));
        }));

        return list;
    }
}
