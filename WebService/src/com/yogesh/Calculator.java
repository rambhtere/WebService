package com.yogesh;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	
	@WebMethod
	public int add(int a, int b){
		return a+b;
	}
	
	@WebMethod
	public int sub(int a, int b){
		return a-b;
	}
	
	@WebMethod
	public int mul(int a, int b){
		return a*b;
	}
	
	@WebMethod
	public int div(int a, int b){
		return a/b;
	}
	
	public String concatenate(String a, String b){
		return a+b;
	}
}
