package pages;

import testngapibase.Annotation;

public class IrctcLogin extends Annotation {

	public LoginUserNamePassword clickLoginButton() {
		click(driver.findElementByXPath("//a[text()=' LOGIN ']"));
		return new LoginUserNamePassword();
	}

	public IrctcLogin enterFrom(String data) {
		clearAndType(driver.findElementByXPath("//input[@placeholder='From*']"), data);
		return this;
	}

	public IrctcLogin enterTo(String data) {
		clearAndType(driver.findElementByXPath("//input[@placeholder='To*']"), data);
		return this;
	}

	public IrctcLogin enterDate() {
		clear(driver.findElementByXPath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']"));
		return this;
	}

	public IrctcLogin enterClass(String value) {
		click(driver.findElementByXPath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']"));
		click(driver.findElementByXPath("(//span[@class='ng-tns-c13-7 ng-star-inserted'])[10]"));
		return this;
	}

	public TrainSearch clickFindTrains() {
		click(driver.findElementByXPath("//button[text()='Find trains']"));
		return new TrainSearch();
	}
}
