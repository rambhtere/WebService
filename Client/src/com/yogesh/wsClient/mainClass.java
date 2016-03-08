package com.yogesh.wsClient;

import com.yogesh.Calculator;
import com.yogesh.CalculatorService;

public class mainClass {

	public static void main(String[] args) {
	
		CalculatorService servicePort= new CalculatorService();
		Calculator calc= servicePort.getCalculatorPort();
		
		System.out.println("Addition result is "+calc.add(3, 4));
		
	}

}
