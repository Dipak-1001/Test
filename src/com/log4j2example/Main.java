package com.log4j2example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger log  = LogManager.getLogger();
	
	
	public static void main(String[] args) {
		System.out.println("main method Strated");
		log.trace("i'm trace");
		
		
		System.out.println("******-----*******------*****");
		
		
		
		System.out.println("main method ended");

	}

}
