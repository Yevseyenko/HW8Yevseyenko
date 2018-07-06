package com.epam;

import org.apache.log4j.Logger;

public class Sample {
    private static final Logger log = Logger.getLogger(Sample.class);

    public void myMethod(String text, int... args) {
        log.info(text);
    }

    public void myMethod(String... args) {
        log.info(args);
    }
}
