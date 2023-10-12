package de.dortmund.fh.model;

public abstract class Vehicle {

	private String vehicleCategory;
	public abstract void showCharacteristics();
	
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	
	

}
