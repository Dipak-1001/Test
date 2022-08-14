package com.log4j2example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static final Logger log=LogManager.getLogger();
	
	public void m1() {
		
		System.out.println("Demo Class M1 Method");
		
	}
}
