

public class Paint {
	String name;
	String price;
	int coveragePerLitre;
	int litresPerTin;
	int coveragePerTin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getCoveragePerLitre() {
		return coveragePerLitre;
	}

	public void setCoveragePerLitre(int coveragePerLitre) {
		this.coveragePerLitre = coveragePerLitre;
	}

	public int getCoveragePerTin() {
		return coveragePerTin;
	}

	public void setCoveragePerTin(int coveragePerTin) {
		this.coveragePerTin = coveragePerTin;
	}

	public Paint(String name, String price, int coveragePerLitre,  int litresPerTin,
			int coveragePerTin) {
		this.name = name;
		this.price = price;
		this.coveragePerLitre = coveragePerLitre;
		this.coveragePerTin = coveragePerTin;
		this.litresPerTin = litresPerTin; 
	}

	public int calculate(int roomArea) {
		return roomArea;
	
	}
}
	