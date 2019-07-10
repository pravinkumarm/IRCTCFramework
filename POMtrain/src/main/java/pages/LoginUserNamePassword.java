package pages;

import testngapibase.Annotation;

public class LoginUserNamePassword extends Annotation {

	public LoginUserNamePassword enterUserName(String data) {

		clearAndType(driver.findElementById("userId"), data);
		return this;

	}

	public LoginUserNamePassword enterpassword(String data) {
		
		clearAndType(driver.findElementById("pwd"), data);
		return this;

	}

	public IrctcLogin clicklogin() {
		click(driver.findElementByXPath("//button[text()='SIGN IN']"));
		return new IrctcLogin();
	}
}
