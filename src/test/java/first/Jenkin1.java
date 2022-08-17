package first;

import org.testng.annotations.Test;

public class Jenkin1 {

	@Test
	public void display() {

		System.out.println("display is executed");
		System.out.println("mvn success");

	}

	@Test
	public void sub() {

		System.out.println("sub is executed");
		System.out.println("build success");
	}

}
