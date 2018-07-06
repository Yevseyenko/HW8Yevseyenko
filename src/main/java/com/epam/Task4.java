package com.epam;


import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Task4 {
    private static final Logger log = Logger.getLogger(Task4.class);

    int money;
    String owner;

    private String moneyAdd(int money) {
        return "money++";
    }

    private int deleteOwner(String owner) {
        return 0;
    }

    private double growing(double height) {
        return height;
    }

    public void methodParam() {
        Task4 task4 = new Task4();
        Class cls = task4.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                log.info(method.getName());
                log.info("Parameter of method: " + parameter.getType());
                log.info("Returned type of method: " + method.getReturnType());
            }
        }
    }
}
