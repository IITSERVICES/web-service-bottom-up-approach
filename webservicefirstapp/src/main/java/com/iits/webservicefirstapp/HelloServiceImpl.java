package com.iits.webservicefirstapp;

 

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.iits.webservicefirstapp.HelloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello, " + name + " from Java SOAP WebService!";
    }
}
