package de.openhpi.capstone1.abstractfactory;

public class FactoryA extends AbstractFactory{
		
	@Override
	public ProductX createProductX() {
		return new ProductAX();
	}
	
	@Override
	public ProductY createProductY() {
		return new ProductAY();
	}
}
