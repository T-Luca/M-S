package petrinetcoffee;

import java.util.List;

public class Transition {

	private List<Arc> arce;
	private String tag;

	public Transition(List<Arc> arcs, String tag) {
		this.arce = arcs;
		this.tag = tag;
	}

	public boolean isValid() {
		for (Arc arc : arce) {
			if (!arc.isValid()) {
				return false;
			}
		}

		return true;
	}

	public void update() {
		if (!isValid()) {
			return;
		}

		for (Arc arc : arce) {
			arc.update();
		}
	}

	public String getTag() {
		return tag;
	}

}