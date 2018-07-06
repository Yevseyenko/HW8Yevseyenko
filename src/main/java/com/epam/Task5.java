package com.epam;

import java.lang.reflect.Field;

public class Task5 {
    public  Field setField(Class someClass, Field field,Object fieldValue) throws IllegalAccessException {
        for (Field f : someClass.getClass().getDeclaredFields()) {
            Class<?> cls = f.getType();
            if (cls.equals(Integer.class)) {
                field.setInt(someClass, 0);
            }
            if (cls.equals(Long.class)){
                field.setLong(field, 0l);
            }
            if (cls.equals(String.class)){
                field.set(fieldValue ,"null");
            }
            if (cls.equals(Double.class)) {
                field.setDouble(someClass, 0.0);
            }
            if (cls.equals(Boolean.class)) {
                field.setBoolean(someClass, false);
            }
        }
        return field;
    }
}
