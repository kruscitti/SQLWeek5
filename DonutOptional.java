import java.util.NoSuchElementException;
import java.util.Optional;

public class DonutOptional {
	public static void main(String[] args) {
		new DonutOptional().run();

	}

	private void run() {
		Donut donut = donutMethod(Optional.of(new Donut("Lost")));
		System.out.println(donut);
	
		try {
		donutMethod(Optional.empty());
	}
		catch(NoSuchElementException e) {
		System.out.println(e.getMessage());
	}
		
}
	private Donut donutMethod(Optional<Donut> optionalDonut) {
		return optionalDonut.orElseThrow(() -> new NoSuchElementException("No Donut!"));
	}
}

