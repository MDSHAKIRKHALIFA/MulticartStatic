package multicard.steps.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import multicard.steps.defination.MctTestHelper;
import multicard.test.data.User;

public class Hooks {
	// Dependency injection
	
	// Constructor 
//	Hooks(){
//		
//	}
	
	/** Hooks Before & After   */
	@Before
	public void beforeScenarioStart() {
		System.out.println("Scenario Started... ");
		
		
		// Prepare a Test User James for All test 
		MctTestHelper.james = new User();
		MctTestHelper.james.setID("user");
		MctTestHelper.james.setPassword("pass");
		MctTestHelper.james.setprofileName("JAMES WILLIAMS");
	}
	
	@After
	public void afterScenarioEnd() {
		
		System.out.println("Scenario Ended... ");
		MctTestHelper.driver.close();
	}
	

	
	
}
