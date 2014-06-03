package es.unileon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unileon.domain.MalformedHandlerException;
import es.unileon.domain.Office;

public class OfficeTest {

	   Office testOffice;
	   Office anotherTestOffice;

	   String description;
	   String address;
	   String city;
	   int testExpenses;
	   int totalExpenses;
	   int totalIncome;
	    

	    @Before
	    public void setUp() throws MalformedHandlerException {
	    testExpenses = 1000;
	    totalExpenses = 3000;
	    totalIncome = 1000;
	    description = "Office1";
	    city = "Leon";
	    address = "Calle 123";
	    testOffice = new Office(description, city, address);
	    }
	@Test
	public void testGetDescription() {
		String testDesc = "Office1";
		assertTrue(testOffice.getDescription() == testDesc);
	}

	@Test
	public void testGetciudad() {
		String testCit = "Leon";
		assertTrue(testOffice.getCiudad() == testCit);
	}

	@Test
	public void testSetCiudad() {
		String testCit = "Leon";
		String testCit2 = "Madrid";
		assertTrue(testOffice.getCiudad() == testCit);
		this.testOffice.setCiudad(testCit2);
		assertTrue(testOffice.getCiudad() == testCit2);
	}

	@Test
	public void testSetDescription() {
		String testDesc = "Office1";
		String testDesc2 = "Office3";
		assertTrue(testOffice.getDescription() == testDesc);
		this.testOffice.setDescription(testDesc2);
		assertTrue(testOffice.getDescription() == testDesc2);
	}

	@Test
	public void testGetAddress() {
		String testAddress = "Calle 123";
		assertTrue(testOffice.getAddress() == testAddress);
	}

	@Test
	public void testSetAddress() {
		String testAddress = "Calle 123";
		String testAddress2 = "Calle 321";
		assertTrue(testOffice.getAddress() == testAddress);
		this.testOffice.setAddress(testAddress2);
		assertTrue(testOffice.getAddress() == testAddress2);
	}



	

}
