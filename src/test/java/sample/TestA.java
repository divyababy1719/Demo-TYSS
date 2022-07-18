package sample;

import org.testng.annotations.Test;

public class TestA {
	@Test(groups="regression")
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}

}
