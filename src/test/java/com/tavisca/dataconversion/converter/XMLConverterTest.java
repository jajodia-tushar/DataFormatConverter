package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tavisca.dataconversion.data.DataSource;
import org.junit.BeforeClass;
import org.junit.Test;

public class XMLConverterTest {
    private static DataSource dataSource;

    @BeforeClass
    public static void initilize(){
        dataSource = new DataSource();
    }


    @Test
    public void willConvertSingleObjectToXMLFormat() throws JsonProcessingException {
        String jsonFormat = XMLConverter.writeXMLFormatToFile(dataSource.getSingleEmployee());
        System.out.println(jsonFormat);
    }

    @Test
    public void willConvertGroupOfObjectToXMLFormat() throws JsonProcessingException {
        String jsonFormat = XMLConverter.writeXMLFormatToFile(dataSource.getAllEmployee());
        System.out.println(jsonFormat);
    }

    @Test
    public void willWriteSingleObjectToXMLFormatInFile() throws JsonProcessingException {
        String jsonFormat = XMLConverter.writeXMLFormatToFile(dataSource.getAllEmployee());
        System.out.println(jsonFormat);
    }
}
