package multicard.pages.object.model;

import org.openqa.selenium.WebDriver;

public class MyaccountPage extends MasterPage {

	//WebDriver driver;
	
	String myOrderLink = "{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";


	public MyaccountPage(WebDriver driver) {
		super(driver); // Master Please Use this Driver
	}


	public OrderPage navigateToMOrderPage() {
		clickElement(getWebElementBy(myOrderLink));
		uglyWaitFor(2000);
		return new OrderPage(driver);
	}

}
