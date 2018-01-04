package com.krima.model;

public class Car {
	
	private String brande;
	private String model;
	public Car() {
		super();
	}
	public Car(String brande, String model) {
		super();
		this.brande = brande;
		this.model = model;
	}
	public String getBrande() {
		return brande;
	}
	public void setBrande(String brande) {
		this.brande = brande;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [brande=" + brande + ", model=" + model + "]";
	}
	
	

}
