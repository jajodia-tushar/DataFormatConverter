package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tavisca.dataconversion.model.Employee;

public class CSVConverter {

    public static String getCSVFormat(Object object) throws JsonProcessingException {

        CsvMapper mapper = new CsvMapper();
        CsvSchema columns = mapper.schemaFor(Employee.class);
        return mapper.writer(columns).writeValueAsString(object);
    }
}
