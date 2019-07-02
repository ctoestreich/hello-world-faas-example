package com.example.faas;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloWorldFaasFunctionTest {

    @Inject
    HelloWorldFaasClient client;

    @Test
    public void testFunction() throws Exception {
        HelloWorldFaas body = new HelloWorldFaas();
        body.setName("hello-world");
        assertEquals("hello-world muxed", client.apply(body).blockingGet().getName());
    }
}
