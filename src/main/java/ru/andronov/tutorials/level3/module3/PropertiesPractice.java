package ru.andronov.tutorials.level3.module3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("src/main/resources/log4j2.properties")));
        System.out.println("props.getProperty(\"appender.out.type\") = " + props.getProperty("appender.out.type"));
    }

}
