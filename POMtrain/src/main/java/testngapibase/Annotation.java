package testngapibase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;



import apibase.SeleniumBase;
import utils.DataLibrary;

public class Annotation extends SeleniumBase{
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "https://www.irctc.co.in/nget/train-search");
	
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }
}
