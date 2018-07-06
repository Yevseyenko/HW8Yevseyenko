package com.epam;

import org.apache.log4j.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Task2_3 {
    private static final Logger log = Logger.getLogger(Task2_3.class);
    @Myannotation(name = "Name of created object")
    private String name = "Name";
    @Myannotation(name = "parameter Age")
    private int age;
    @Myannotation(name = "parameter weight")
    protected double weight;
    private String surname = "Surname";
    private double height;

    public void print() {
        Task2_3 task = new Task2_3();
        Class c = task.getClass();
        for (Field field : c.getDeclaredFields()) {
            if (field.isAnnotationPresent((Class<? extends Annotation>) Myannotation.class)) {
                log.info(field);
            }
        }
    }

    public void printAnnotation() {
        Task2_3 task = new Task2_3();
        for (Field field : task.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent((Class<? extends Annotation>) Myannotation.class)) {
                Myannotation ann = field.getAnnotation(Myannotation.class);
                log.info(ann.toString());
            }
        }
    }

}



