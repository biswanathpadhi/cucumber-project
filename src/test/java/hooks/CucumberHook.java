package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook {

	@Before
	public void setUp() {
		System.out.println("Running before hook from CucumerHook");
	}

	@After
	public void tearDown() {
		System.out.println("Running after hook from CucumberHook");
	}
}
