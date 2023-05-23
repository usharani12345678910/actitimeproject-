package entertimrtrack;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Dataproviders.DataExcel;
import utilities.BaseClass1;

public class CreateCustomer extends BaseClass1{
	
	
	
	@Test (groups= {"Regression","Smoke"},priority=2)
	public void createTasks(String taskName) throws InterruptedException {
		
		enterTimeTrack_PO.getClickontasks().click();
		enterTimeTrack_PO.getClickonadd_new().click();
		Thread.sleep(3000);
		List<WebElement> list=enterTimeTrack_PO. getListofalldropdown();
		Thread.sleep(3000);
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		enterTimeTrack_PO.getClickon_createcustiomer().click();
		enterTimeTrack_PO.getClickon_createcustiomer().sendKeys("tasks");
		enterTimeTrack_PO.getClickon_discritiontextbox().click();
		enterTimeTrack_PO.getClickon_discritiontextbox().sendKeys("this is discription");
		enterTimeTrack_PO.getClickon_dropdown().click();
		enterTimeTrack_PO.getClickon_firstcompany().click();
		enterTimeTrack_PO.getClickon_createcustiomer().click();
		
		
	}
	}

		
		
		