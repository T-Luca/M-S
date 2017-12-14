package petrinetcoffee;

public class Location {

	private String tag;
	private int jetoane;

	public Location(String tag, int jetoane) {
		this.tag = tag;
		this.jetoane = jetoane;
	}

	public void addJetoane(int jetoane) {
		this.jetoane += jetoane;
	}

	public void substractJetoane(int jetoane) {
		this.jetoane -= jetoane;
	}

	public int getJetoane() {
		return jetoane;
	}

	public void setJetoane(int jetoane) {
		this.jetoane = jetoane;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}