package com.epam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value ={ElementType.FIELD})
public @interface Myannotation {
    String name();
    boolean annotated() default true;

}
