package de.openhpi.capstone1.starter;

import de.openhpi.capstone1.abstractfactory.AbstractFactory;
import de.openhpi.capstone1.abstractfactory.FactoryA;
import de.openhpi.capstone1.abstractfactory.FactoryB;

public class Context {

	public static void main(String[] args) {
		
		String type = "B";
		AbstractFactory factory;
		
		if ("A".equals(type)) {
			factory = new FactoryA();
			factory.createProductX(); 
			factory.createProductY(); 
		} else {
			factory = new FactoryB();
			factory.createProductX(); 
			factory.createProductY(); 
		}
	}

}
