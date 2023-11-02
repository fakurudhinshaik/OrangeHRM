package com.TestNgPractice;

import org.testng.annotations.Test;

public class TestNgExample3  extends TestNgExample1{
	
	@Test
	public void ApplicationTitle()
	{
		
		String ICICIApplication=driver.getTitle();
		System.out.println("ICICI Home Page is :-"+ICICIApplication);
		
	}

}
