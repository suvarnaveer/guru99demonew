package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_classes.Baseclass;
import pages.Login_page;
import pages.NewAccount_add;

public class Add_Account_test extends Baseclass {
	@Test
	public void add_Account() throws Exception {
		/*Login_test log=new Login_test(driver);
		log.LoginApplication();*/
		Login_page login=PageFactory.initElements(driver, Login_page.class);
		login.login_guru99("mngr149258", "YmedegE");
		Thread.sleep(6000);
		NewAccount_add addacct=PageFactory.initElements(driver, NewAccount_add.class);
		addacct.addNewAccount("13728", "5000");
		addacct.accountType("Current");
		
	}
}
