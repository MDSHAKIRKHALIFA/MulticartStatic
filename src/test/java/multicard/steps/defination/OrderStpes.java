package multicard.steps.defination;

import org.junit.Assert;

import cucumber.api.java.en.Then;

public class OrderStpes {

	

	// Dependency injection
	
	// Constructor 
//	OrderStpes(){
//		
//	}
	
	
	/** Steps For Order Features   */

	@Then("^I expect Order page header is availablee$")
	public void I_expect_order_table_is_availablee() {
		System.out.println("#### I expect order table is available ######");
		boolean orderTableExist = MctTestHelper.order.isOrderPageHeaderAvailable();
		Assert.assertEquals("Order Page Header Not Exist.", true, orderTableExist );

	}
	
	@Then("^I expect Order History Table Avaiable$")
	public void I_expect_Order_History_Table_Avaiable() {
		System.out.println("#### I expect order table is available ######");
		boolean orderTableExist = MctTestHelper.order.isOrderTableExist();
		Assert.assertEquals("Order Page Header Not Exist.", true, orderTableExist );
	}
	

	
	
}
