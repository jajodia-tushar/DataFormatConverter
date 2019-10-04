package com.tavisca.dataconversion.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLConverter {


    public static String writeXMLFormatToFile(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(object);

    }

    public static void serializeToXML (Object object) throws IOException{
        FileOutputStream fos = new FileOutputStream("data.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(object);
        encoder.close();
        fos.close();
    }
}
