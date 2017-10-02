package suppressWarnings;

import java.util.ArrayList;

public class DeprecatedDemo {

	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {

		ExampleA exampleA = new ExampleA();

		ArrayList arrayList = new ArrayList<>();

	}

}
