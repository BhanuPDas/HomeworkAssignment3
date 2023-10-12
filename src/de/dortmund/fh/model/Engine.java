package de.dortmund.fh.model;

public abstract class Engine {
	
	private String engineCategory;
	
	public Engine(String engineCategory) {
		this.engineCategory = engineCategory;
	}

	public String getEngineCategory() {
		return engineCategory;
	}
	
	public abstract void showEngineDetails();

}
