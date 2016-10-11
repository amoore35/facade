package elon.edu.adapter;

public class Compound implements ChemicalCompound {

	private String compound;
	private ChemicalDataBank dataBank;
	
	public Compound(String compound) {
		this.compound = compound;
		dataBank = new ChemicalDataBank();
	}
		
	@Override
	public String display() {
		String display = "Compound: " + compound + "------\n"
			    + "Formula: " + getMolecularFormula() + "\n"
				+ "Weight: " + getMolecularWeight() + "\n"
				+ "Melting Pt: " + getMeltingPoint() + "\n"
				+ "Boiling Pt: " + getBoilingPoint() + "\n";
		
		return display;
	}

	@Override
	public double getBoilingPoint() {
		return dataBank.getCriticalPoint(compound, "B");
	}

	@Override
	public double getMeltingPoint() {
		return dataBank.getCriticalPoint(compound, "M");
	}

	@Override
	public String getMolecularFormula() {
		return dataBank.getMolecularStructure(compound);
	}

	@Override
	public double getMolecularWeight() {
		return dataBank.getMolecularWeight(compound);
	}
	
}
