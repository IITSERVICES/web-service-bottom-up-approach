package com.iits.webservicefirstapp;

import jakarta.xml.ws.Endpoint;

public class App {
	 public static void main(String[] args) {
	        String url = "http://localhost:8081/hello";
	        Endpoint.publish(url, new HelloServiceImpl());
	        System.out.println("SOAP Service published at: " + url + "?wsdl");
	    }
}
