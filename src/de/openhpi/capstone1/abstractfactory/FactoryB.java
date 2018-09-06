package de.openhpi.capstone1.abstractfactory;

public class FactoryB extends AbstractFactory {
	@Override
	public ProductX createProductX() {
		return new ProductBX();
	}
	
	@Override
	public ProductY createProductY() {
		return new ProductBY();
	}
}
