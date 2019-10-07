package com.tavisca.dataconversion.data;

import com.sun.jmx.snmp.defaults.DefaultPaths;
import com.tavisca.dataconversion.connection.MySQLConnection;
import com.tavisca.dataconversion.model.Department;
import com.tavisca.dataconversion.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class MysqlRepository {
    Connection connection;

    public MysqlRepository(){
        try {
            this.connection = MySQLConnection.getConnection();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        try {
            PreparedStatement statement = this.connection.prepareStatement("select * from employee");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String address = resultSet.getString(4);
                int deptId = resultSet.getInt(5);
                list.add(new Employee(id,name,email,address,deptId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Employee getSingleEmployee() {
        Employee emp = new Employee();
        try {
            PreparedStatement statement = this.connection.prepareStatement("select * from employee where id = 1");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setEmail(resultSet.getString(3));
                emp.setAddress(resultSet.getString(4));
                emp.setDeptId(resultSet.getInt(5));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public ArrayList<Employee> getAllEmployeeByDeptId(int deptId){
        ArrayList<Employee> list = new ArrayList<>();
        try {
            PreparedStatement statement = this.connection.prepareStatement("select * from employee where deptId = ?");
            statement.setInt(1,deptId);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String address = resultSet.getString(4);
                int deptId1 = resultSet.getInt(5);
                list.add(new Employee(id,name,email,address,deptId1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Department> getAllDepartment(){
        ArrayList<Department> list = new ArrayList<>();
        try {
            PreparedStatement statement = this.connection.prepareStatement("select * from department");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int deptId = resultSet.getInt(1);
                String deptName = resultSet.getString(2);
                Department department = new Department(deptName,deptId);
                list.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
