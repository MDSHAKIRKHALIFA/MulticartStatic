package multicard.steps.defination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import multicard.pages.object.model.HomePage;

public class CommonSteps {

	
	// Dependency injection
	
	// Constructor 
//	CommonSteps(){
//		
//	}

	
	/** Steps Common For All  */

	@Given("^I open browser chrome$")
	public void i_open_browser_chrome(){
		//System.out.println("#### I open browser chrome ######");
		WebDriverManager.chromedriver().setup();
		MctTestHelper.driver = new ChromeDriver();		
	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page(){
		System.out.println("#### I land on multicart landing page ######");
		MctTestHelper.home = new HomePage(MctTestHelper.driver);
		MctTestHelper.home.gotoHomePage();
	}

	
}
