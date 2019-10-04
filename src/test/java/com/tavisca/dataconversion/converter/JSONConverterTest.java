package com.tavisca.dataconversion.converter;

import com.tavisca.dataconversion.data.DataSource;
import org.junit.BeforeClass;
import org.junit.Test;

public class JSONConverterTest {

    private static DataSource dataSource;

    @BeforeClass
    public static void initilize(){
        dataSource = new DataSource();
    }

    @Test
    public void willConvertSingleObjectToJSONFormat(){
        String jsonFormat = JSONConverter.getJSONFormat(dataSource.getSingleEmployee());
        System.out.println(jsonFormat);
    }

    @Test
    public void willConvertGroupOfObjectToJSONFormat(){
        String jsonFormat = JSONConverter.getJSONFormat(dataSource.getAllEmployee());
        System.out.println(jsonFormat);
    }
}
