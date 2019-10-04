package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tavisca.dataconversion.data.MysqlRepository;
import com.tavisca.dataconversion.model.Employee;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


public class XMLConverterTest {
    private static MysqlRepository mysqlRepository;
    private static ArrayList<Employee> list;

    @BeforeClass
    public static void initialise(){
        mysqlRepository = Mockito.mock(MysqlRepository.class);
        list = new ArrayList<Employee>(){{
            add(new Employee(1,"Tushar","jajodiatushar@gmail.com","Nepal"));
            add(new Employee(2,"Aniket","aniketSingla@gmail.com","India"));
        }};
    }

    @Test
    public void willConvertSingleObjectToXMLFormat() throws JsonProcessingException {
        when(mysqlRepository.getSingleEmployee()).thenReturn(list.get(0));
        String jsonFormat = XMLConverter.getXMLFormat(mysqlRepository.getSingleEmployee());
        System.out.println(jsonFormat);
    }

    @Test
    public void willConvertGroupOfObjectToXMLFormat() throws JsonProcessingException {
        when(mysqlRepository.getAllEmployee()).thenReturn(list);
        String jsonFormat = XMLConverter.getXMLFormat(mysqlRepository.getAllEmployee());
        System.out.println(jsonFormat);
    }

    @Test
    public void willWriteSingleObjectToXMLFormatInFile() throws IOException {
        when(mysqlRepository.getSingleEmployee()).thenReturn(list.get(0));
        XMLConverter.serializeToXML(mysqlRepository.getSingleEmployee());
    }

    @Test
    public void willWriteGroupOfToXMLFormatInFile() throws IOException {
        when(mysqlRepository.getAllEmployee()).thenReturn(list);
        XMLConverter.serializeToXML(mysqlRepository.getAllEmployee());
    }
}
