package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tavisca.dataconversion.data.DataSource;
import org.junit.BeforeClass;
import org.junit.Test;

public class CSVConverterTest {
    private static DataSource dataSource;

    @BeforeClass
    public static void initilize(){
        dataSource = new DataSource();
    }


    @Test
    public void willConvertSingleObjectToCSVFormat() throws JsonProcessingException {
        String jsonFormat = CSVConverter.getCSVFormat((dataSource.getSingleEmployee()));
        System.out.println(jsonFormat);
    }

    @Test
    public void willConvertGroupOfObjectToCSVFormat() throws JsonProcessingException {
        String jsonFormat = CSVConverter.getCSVFormat((dataSource.getAllEmployee()));
        System.out.println(jsonFormat);
    }

}
