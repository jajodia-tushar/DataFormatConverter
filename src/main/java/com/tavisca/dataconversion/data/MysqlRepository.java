package com.tavisca.dataconversion.data;

import com.tavisca.dataconversion.connection.MySQLConnection;
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
                list.add(new Employee(id,name,email,address));
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }
}
