package Extent.Report.Testcase;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Extent.Report.Core.Base;
import Extent.Report.Main.ListSystem_login_page;

public class ListSystem_login_page_Tasecase extends Base {

	@Test
	public void login() throws InterruptedException {
		test = extent.createTest("Verify The User Login");
		logger.info("The List System Open");
		ListSystem_login_page Listsystemloginpage = new ListSystem_login_page(driver);
		Thread.sleep(2000);
		Listsystemloginpage.Enteremailaddress();
		test.log(Status.PASS, "Enter user Mail Address");
		Thread.sleep(2000);
		Listsystemloginpage.EnterPassword();
		test.log(Status.PASS, "Enter user Password");
		Thread.sleep(2000);
		Listsystemloginpage.applyBtn();
		test.log(Status.PASS, "The List System User Is Able To Login Successfully");
	}

	@Test /* <-- Main Side bar Container --> */
	public void SidebarContainer() throws InterruptedException {
		test = extent.createTest("Verify The User Logout");
		logger.info("The List System User Is Able To Click Side Successfully");
		ListSystem_login_page Sidebar = new ListSystem_login_page(driver);
		test.log(Status.PASS, "The List System User Is Able To Click on Contact Side Successfully");
		Thread.sleep(3000);
		Sidebar.Contactclick();
		test.log(Status.PASS, "The List System User Is Able To Click on Contact Side Successfully ");
	}
}