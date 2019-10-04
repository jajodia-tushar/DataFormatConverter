package com.tavisca.dataconversion.data;

import static org.junit.Assert.*;
import com.tavisca.dataconversion.model.Employee;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class MysqlRepositoryTest {

    public static  MysqlRepository mysqlRepository;

    @BeforeClass
    public static void initialise(){
        mysqlRepository = new MysqlRepository();
    }


    @Test
    public void canGetSingleEmployee(){
        Employee singleEmployee = mysqlRepository.getSingleEmployee();
        assertTrue(singleEmployee != null);
    }

    @Test
    public void canGetCollectionOfEmployee(){
        ArrayList<Employee> allEmployee = mysqlRepository.getAllEmployee();
        assertTrue(allEmployee.size() > 1);
    }
}
