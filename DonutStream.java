import java.util.stream.Collectors;

public class DonutStream {
	public static void main(String[] args) {
		new DonutStream().run();
		
	}

	private void run() {
		String donuts =  Donut.getDonuts().stream()
			.map(Donut::toString)
			.sorted()
			.collect(Collectors.joining(", "));
	
		System.out.println(donuts);
	}

}
