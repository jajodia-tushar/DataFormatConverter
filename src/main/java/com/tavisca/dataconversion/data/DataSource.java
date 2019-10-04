package com.tavisca.dataconversion.data;

import com.tavisca.dataconversion.model.Employee;

import java.util.ArrayList;

public class DataSource {

    public Employee getSingleEmployee(){

        return new Employee(1,"Tushar","jajodiatushar@gmail.com","Nepal");
    }

    public ArrayList<Employee> getAllEmployee(){
        return new ArrayList<Employee>(){{
            add( new Employee(1,"Tushar","jajodiatushar@gmail.com","Nepal"));
            add( new Employee(2,"Deepak","deepak12@gmail.com","India"));
            add( new Employee(1,"Ammar","ammarmah@gmail.com","Africa"));
            add( new Employee(1,"Chandan","chandansahah@gmail.com","Bangladesh"));
            add( new Employee(1,"Rajesh","rajeshrai@gmail.com","bhutan"));
        }};
    }
}
