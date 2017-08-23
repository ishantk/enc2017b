package com.auribises;

public class Child extends Parent{
	
	// Attributes
	int vehicles;

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Child [vehicles=" + vehicles + "] "+super.toString();
	}
	
}
