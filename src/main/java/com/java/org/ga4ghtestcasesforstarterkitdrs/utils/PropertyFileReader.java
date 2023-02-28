package com.java.org.ga4ghtestcasesforstarterkitdrs.utils;

import lombok.extern.log4j.Log4j2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Log4j2
public class PropertyFileReader {

    public static Properties propertyReader() {
        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader("src/test/resources/application.properties");
            properties.load(reader);
        } catch (IOException e) {
            log.error(e);
        }
        return properties;
    }

}
