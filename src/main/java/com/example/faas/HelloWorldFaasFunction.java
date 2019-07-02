package com.example.faas;

import io.micronaut.function.FunctionBean;
import io.micronaut.function.executor.FunctionInitializer;

import java.io.IOException;
import java.util.function.Function;

@FunctionBean("hello-world-faas")
public class HelloWorldFaasFunction extends FunctionInitializer implements Function<HelloWorldFaas, HelloWorldFaas> {

    @Override
    public HelloWorldFaas apply(HelloWorldFaas msg) {
        return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String... args) throws IOException {
        HelloWorldFaasFunction function = new HelloWorldFaasFunction();
        function.run(args, (context) -> function.apply(context.get(HelloWorldFaas.class)));
    }
}

