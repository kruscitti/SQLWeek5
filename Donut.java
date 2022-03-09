import java.util.ArrayList;
import java.util.List;

public class Donut {
	private String name;
	
	
	private static List<Donut> donuts= new ArrayList<>(List.of(
			new Donut("Boston Creme"),
			new Donut("Glazed"),
			new Donut("French Cruller"),
			new Donut("Blueberry"),
			new Donut("Chocolate Sprinkle")
			));

	
public Donut(String name) {
	this.name = name;
	}

public String getName() {
	return name;
}

public static int compare(Donut d1, Donut d2) {
	return d1.name.compareTo(d2.name);
}
@Override
public String toString() {
	return name + " Donut";
}

public static List<Donut> getDonuts() {
	return new ArrayList<>(donuts);
	}
}




