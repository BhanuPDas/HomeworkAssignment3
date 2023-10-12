package de.dortmund.fh.model;

public class Manufacture {

	private String id;
	private String manufacturerName;
	private String manufacturerCode;
	private int yearOfManufacture;

	public Manufacture(String id, String manufacturerName, String manufacturerCode, int yearOfManufacture) {
		this.id = id;
		this.manufacturerName = manufacturerName;
		this.manufacturerCode = manufacturerCode;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getId() {
		return id;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public String getManufacturerCode() {
		return manufacturerCode;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

}
