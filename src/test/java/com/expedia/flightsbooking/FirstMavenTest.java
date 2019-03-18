package com.expedia.flightsbooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenTest {

	public static void main(String[] args) {
		// program to get price of course 'Python Programming Language'
		// website : https://learn.letskodeit.com/p/practice
		// xpath://table[@id='product']//td[contains(text(),'Python Programming Language')]//following-sibling::td
		
		WebDriver driver;
		System.out.println("I AM INSIDE CODE");
		System.setProperty("webdriver.chrome.driver","F:\\Library Latest\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String baseURL="https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.get(baseURL);
		String course="Python Programming Language";
		String price=driver.findElement(By.xpath("//table[@id='product']//td[contains(text(),'Python Programming Language')]//following-sibling::td")).getText();
	   
		System.out.println("The price of the"+course+" "+price);
		//driver.close();
	}

}
