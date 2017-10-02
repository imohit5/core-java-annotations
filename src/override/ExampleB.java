package override;

public class ExampleB extends ExampleA {

	@Override
	public String sayHello(String name) {
		return "Hi " + name;
	}

	// @Override
	// public String sayHello(Integer name) {
	// return "Hi "+name;
	// }

}
