package com.example.faas;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface HelloWorldFaasClient {

    @Named("hello-world-faas")
    Single<HelloWorldFaas> apply(@Body HelloWorldFaas helloWorldFaas);

}
