package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CompoundTest {

	private Compound compound;
	
	@Before
	public void setUp() throws Exception {
		compound = new Compound("Water");
	}

	@Test
	public void testGetBoilingPoint() {
		double boilPt = compound.getBoilingPoint();
		assertTrue(boilPt == 100.0);
	}

	@Test
	public void testGetMeltingPoint() {
		double meltPt = compound.getMeltingPoint();
		assertTrue(meltPt == 0.0);
		
	}

	@Test
	public void testGetMolecularFormula() {
		String formula = compound.getMolecularFormula();
		assertEquals(formula, "H2O");
	}

	@Test
	public void testGetMolecularWeight() {
		double weight = compound.getMolecularWeight();
		assertTrue(weight == 18.015);
	}
}
