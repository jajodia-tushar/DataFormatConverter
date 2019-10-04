package com.tavisca.dataconversion.data;

import com.tavisca.dataconversion.model.Employee;

import java.util.ArrayList;

public class DataSource {

    public Employee getSingleEmployee(){

        return new Employee(1,"Tushar","jajodiatushar@gmail.com","Nepal");
    }

    public ArrayList<Employee> getAllEmployee(){
        MysqlRepository mysqlRepository = new MysqlRepository();
        return mysqlRepository.getAllEmployee();
    }
}
