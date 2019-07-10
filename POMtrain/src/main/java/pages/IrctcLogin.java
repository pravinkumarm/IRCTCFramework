package pages;

import testngapibase.Annotation;

public class IrctcLogin extends Annotation {
	
public LoginUserNamePassword clickLoginButton() {
	click(driver.findElementByXPath("//a[text()=' LOGIN ']"));
		return new LoginUserNamePassword();
}



}
