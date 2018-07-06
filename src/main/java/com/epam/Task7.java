package com.epam;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Task7<T> {
    private static final Logger log = Logger.getLogger(Task7.class);

    public void getInfo(Class<T> abc) {
        for (Field field : abc.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = null;
            try {
                value = field.get(abc);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            log.info("Field name: " + name + " Field value: " + value);
        }
        ArrayList<String> allMethods = new ArrayList<String>();
        for (Method aMethod : abc.getDeclaredMethods()) {
            allMethods.add("Method Name : " + aMethod.getName());
        }
        log.info(allMethods.toArray(new String[allMethods.size()]));
    }
}
