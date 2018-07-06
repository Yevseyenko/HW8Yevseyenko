package com.epam;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task6 {
    private static final Logger log = Logger.getLogger(Task6.class);

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Sample sample = new Sample();
        try {
            Class<?> cls = sample.getClass();
            Method method1 = cls.getDeclaredMethod("myMethod", String.class, int[].class);
            log.info(method1);
            Method method2 = cls.getDeclaredMethod("myMethod", String[].class);
            log.info(method2);
        } catch (NoSuchMethodException e) {
            log.info("No such method");
        }
        try {
            Class cls1 = sample.getClass();
            Object obj = cls1.newInstance();
            Method method1 = cls1.getMethod("myMethod", String.class, int[].class);
            method1.invoke(obj, "y", new int[]{0, 1, 3});
            method1 = cls1.getMethod("myMethod", String[].class);
            method1.invoke(cls1, new String[]{"hello"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
