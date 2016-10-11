package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChemicalDataBankTest {

	private ChemicalDataBank dataBank;
	
	@Before
	public void setUp() {
		dataBank = new ChemicalDataBank();
	}
	
	@Test
	public void testGetCriticalPoint() {
		float expectedTemp = 5.5f;
		float actualTemp = dataBank.getCriticalPoint("benzene", "M");
		assertTrue(expectedTemp == actualTemp);
	}

	@Test
	public void testGetMolecularStructure() {
		String expectedStruct = "C2H6O2";
		String actualStruct = dataBank.getMolecularStructure("ALCOHOL");
		assertTrue(expectedStruct.equals(actualStruct));
	}

	@Test
	public void testGetMolecularWeight() {
		double expectedWeight = 18.015;
		double actualWeight = dataBank.getMolecularWeight("Water");
		assertTrue(expectedWeight == actualWeight);
	}

}
