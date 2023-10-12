package de.dortmund.fh.model;

public class HybridV extends Vehicle {

	private String id;
	private String vehicleNumber;
	private String make;
	private String model;
	private String color;
	private Manufacture manufacture;
	private Engine engine;

	@Override
	public void showCharacteristics() {
		System.out.println("Vehicle ID:" + getId());
		System.out.println("Vehicle Number:" + getVehicleNumber());
		System.out.println("Vehicle Category:" + getVehicleCategory());
		System.out.println("Vehicle Brand:" + getMake());
		System.out.println("Vehicle Model:" + getModel());
		System.out.println("Vehicle Color:" + getColor());
		System.out.println("Manufacture Details");
		System.out.println("Manufacture ID:" + getManufacture().getId());
		System.out.println("Manufacturer Name:" + getManufacture().getManufacturerName());
		System.out.println("Manufacturer Code:" + getManufacture().getManufacturerCode());
		System.out.println("Manufacturing Year:" + getManufacture().getYearOfManufacture());
		System.out.println("Engine Category:" + getEngine().getEngineCategory());
		getEngine().showEngineDetails();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Manufacture getManufacture() {
		return manufacture;
	}

	public void setManufacture(Manufacture manufacture) {
		this.manufacture = manufacture;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
