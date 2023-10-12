package de.dortmund.fh.main;

import de.dortmund.fh.model.BEV;
import de.dortmund.fh.model.CombustionEngine;
import de.dortmund.fh.model.ElectricEngine;
import de.dortmund.fh.model.HybridEngine;
import de.dortmund.fh.model.HybridV;
import de.dortmund.fh.model.ICEV;
import de.dortmund.fh.model.Manufacture;
import de.dortmund.fh.model.Vehicle;

public class VehicleRun {

	public static void main(String[] args) {

		// Creating Vehicle records
		Vehicle[] vehicleArray = new Vehicle[3];
		Manufacture manufacture1 = new Manufacture("1", "Manufacture Limited 1", "MFG1", 2000);
		Manufacture manufacture2 = new Manufacture("2", "Manufacture Limited 2", "MFG2", 2001);
		Manufacture manufacture3 = new Manufacture("3", "Manufacture Limited 3", "MFG3", 2002);
		CombustionEngine engine1 = new CombustionEngine("Combustion Engine", "10", 2010, 1500);
		ElectricEngine engine2 = new ElectricEngine("Electric Engine", "11", 2011, 1600);
		HybridEngine engine3 = new HybridEngine("Hybrid Engine", "10", 2012, 1700);
		ICEV vehicle1 = new ICEV();
		vehicle1.setVehicleCategory("ICEV");
		vehicle1.setId("100");
		vehicle1.setMake("BMW");
		vehicle1.setModel("i5");
		vehicle1.setVehicleNumber("GMV1");
		vehicle1.setColor("Black");
		vehicle1.setEngine(engine1);
		vehicle1.setManufacture(manufacture1);
		BEV vehicle2 = new BEV();
		vehicle2.setVehicleCategory("BEV");
		vehicle2.setId("101");
		vehicle2.setMake("Mercedes");
		vehicle2.setModel("C-Class");
		vehicle2.setVehicleNumber("GMV2");
		vehicle2.setColor("Red");
		vehicle2.setEngine(engine2);
		vehicle2.setManufacture(manufacture2);
		HybridV vehicle3 = new HybridV();
		vehicle3.setVehicleCategory("Hybrid");
		vehicle3.setId("102");
		vehicle3.setMake("Tata");
		vehicle3.setModel("Nexon");
		vehicle3.setVehicleNumber("GMV3");
		vehicle3.setColor("Green");
		vehicle3.setEngine(engine3);
		vehicle3.setManufacture(manufacture3);
		vehicleArray[0] = vehicle1;
		vehicleArray[1] = vehicle2;
		vehicleArray[2] = vehicle3;

		// Display vehicle records
		for (Vehicle v : vehicleArray) {
			v.showCharacteristics();
			System.out.println("----------------------");
		}
	}

}
