package com.example.faas;

import io.micronaut.core.annotation.Introspected;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Introspected
public class HelloWorldFaas {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldFaas.class);

    private String name;

    public String getName() {
        LOGGER.error("called get name " + new Date().getTime());
        return name+ " muxed";
    }

    public void setName(String name) {
        LOGGER.error("called set name " + new Date().getTime());
        this.name = name;
    }
}

