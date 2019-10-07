package com.tavisca.dataconversion.fileHandling;

import com.tavisca.dataconversion.fileHandling.FileHandler;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class FileHandlerTest {

    @Test
    public void canReturnNewFileName() {
        FileHandler fileHandler = new FileHandler("C:\\Tushar\\Output","json");
        System.out.println(fileHandler.generateUniqueNameForFile());
    }

    @Test
    public void canCreateFileInSpecifiedDirectory() throws IOException {
        FileHandler fileHandler = new FileHandler("C:\\Aniket\\Om","json");
        boolean creationStatus = fileHandler.createNewFile();
        assertTrue(creationStatus);
    }
}
