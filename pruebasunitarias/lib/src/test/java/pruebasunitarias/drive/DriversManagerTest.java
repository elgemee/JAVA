package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	
	private DriversManager driversManager = new DriversManager();
	
	@DisplayName ("Pruebas en el metodo addPassenger")
	
	
	@Test
	void isAddPassenger() {
		Passenger passenger1 = new Passenger("Alexis Gonzalez", "AGB16");
	
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1, driversManager.getPassenger("AGB16"));
	}

	@Test
	void isaddDriver () {
		Driver driver1 = new Driver ("Alexis", "AGB16", 45.5);
		
		driversManager.addDriver(driver1);
	assertEquals(driver1,driversManager.getDriver("AGB16"));
	}
}
