package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tavisca.dataconversion.data.MysqlRepository;
import com.tavisca.dataconversion.model.Employee;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

public class CSVConverterTest {
    private static MysqlRepository mysqlRepository;
    private static ArrayList<Employee> list;

    @BeforeClass
    public static void initilize(){
        mysqlRepository = Mockito.mock(MysqlRepository.class);
        list = new ArrayList<Employee>(){{
            add(new Employee(1,"Tushar","jajodiatushar@gmail.com","Nepal"));
            add(new Employee(2,"Aniket","aniketSingla@gmail.com","India"));
        }};
    }


    @Test
    public void willConvertSingleObjectToCSVFormat() throws JsonProcessingException {
        when(mysqlRepository.getSingleEmployee()).thenReturn(list.get(0));
        String jsonFormat = CSVConverter.getCSVFormat((mysqlRepository.getSingleEmployee()));
        System.out.println(jsonFormat);
    }

    @Test
    public void willConvertGroupOfObjectToCSVFormat() throws JsonProcessingException {
        when(mysqlRepository.getAllEmployee()).thenReturn(list);
        String jsonFormat = CSVConverter.getCSVFormat((mysqlRepository.getAllEmployee()));
        System.out.println(jsonFormat);
    }

}
