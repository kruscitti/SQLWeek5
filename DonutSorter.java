import java.util.List;

public class DonutSorter {

	public static void main(String[] args) {
		new DonutSorter().run();
		
	}
	private void run() {
		List<Donut>lambdaDonuts = sortByLambda();
		System.out.println(lambdaDonuts);
	
		List<Donut> methDonuts = sortByMethod();
		System.out.println(methDonuts);
		
	}
// Write a method to sort the objects using a Method Reference to the compare method you created earlier.
	private List<Donut> sortByMethod() {
		List<Donut> donuts = Donut.getDonuts();
		donuts.sort(Donut::compare);
		return donuts;
	
	}

// Write a method to sort the objects using a Lambda expression using the compare method you created earlier.
	private List<Donut> sortByLambda() {
		List<Donut> donuts = Donut.getDonuts();
		donuts.sort((d1, d2) -> Donut.compare(d1, d2));
		return donuts;
	}
	
	

}
