package petrinetcoffee;

public class Arc {

	private int capacitate;
	private Location locatie;
	private String directie;

	public Arc(int capacitate, Location locatie, String directie) {
		this.capacitate = capacitate;
		this.locatie = locatie;
		this.directie = directie;
	}

	public boolean isValid() {

		if (directie.equals(Direction.OUT)) {
			return true;
		}

		if (directie.equals(Direction.IN) && capacitate <= locatie.getJetoane()) {
			return true;
		}

		return false;
	}

	public void update() {

		if (directie.equals(Direction.IN)) {
			locatie.addJetoane(capacitate);
			return;
		}

		locatie.substractJetoane(capacitate);
	}
}