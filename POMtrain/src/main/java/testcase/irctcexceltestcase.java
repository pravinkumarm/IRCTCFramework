package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.IrctcLogin;
import testngapibase.Annotation;

public class irctcexceltestcase extends Annotation {
	@BeforeTest
	public void setData() {
		testcaseName = "IrctcExcel";
		testcaseDec = "Login, Irctc";
		author = "Pravin";
		category = "smoke";
		excelFileName = "IrctcExcel";
	}

	@Test(dataProvider = "fetchData")
	public void IrctcFrame(String uName, String pwd, String from, String to, String calend, String cla) {
		new IrctcLogin().clickLoginButton().enterUserName(uName).enterpassword(pwd).clicklogin().enterFrom(from)
				.enterTo(to).enterDate().enterClass(cla).clickFindTrains().listOfTrains();
	}
}
