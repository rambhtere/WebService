package com.yogesh;

import javax.xml.ws.Endpoint;

public class MainClass {
	
	public static void main(String[] arg){
		
		Endpoint.publish("http://localhost:8080/WebService/Calculate",new Calculator());
		System.out.println("Service Publised");
	}

}
