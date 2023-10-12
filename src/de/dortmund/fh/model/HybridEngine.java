package de.dortmund.fh.model;

public class HybridEngine extends Engine {

	private String id;
	private int engineYoM;
	private int engineCapacity;

	public HybridEngine(String engineCategory, String id, int engineYoM, int engineCapacity) {
		super(engineCategory);
		this.id = id;
		this.engineYoM = engineYoM;
		this.engineCapacity = engineCapacity;
	}

	public String getId() {
		return id;
	}

	public int getEngineYoM() {
		return engineYoM;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	@Override
	public void showEngineDetails() {
		System.out.println("Engine ID:" + getId());
		System.out.println("Engine Manufactured in:" + getEngineYoM());
		System.out.println("Engine Capacity:" + getEngineCapacity());
		
	}

}
