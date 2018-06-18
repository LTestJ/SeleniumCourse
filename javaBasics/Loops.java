package javaBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loops {

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/josep/Documents/N_Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		String baseURL = "https://www.indeed.com/"; 
		driver.get(baseURL);
		Thread.sleep(1000);
		
		List <WebElement> hyperlinks = driver.findElements(By.tagName("a"));	
		int linksCount = hyperlinks.size();
		System.out.println("Links Count: " + linksCount);
		
		//1. while Loop
//		int i=0;
//		while (i<linksCount)
//		{
//			//evaluate the expression each time 
//			//and until it is false, execute the step below.
//			WebElement link = hyperlinks.get(i);
//			System.out.println(link.getText());
//			i++;			
//		}
		
//		//2. For Loop
//		for (int i=0; i<linksCount; i++)
//		{
//			WebElement link = hyperlinks.get(i);
//			System.out.println(link.getText());	
//		}
		
		//For Each Loop //syntax:		
//		for(item:itemsList)
//		{
//			//execute the following statements for every item in itemsList
//			statements to work on item;
//		}
		
		//3. For Each Loop
		for(WebElement link : hyperlinks)
		{
			//execute the following statements for every item in itemsList
			System.out.println(link.getText());
		}
		
	}

}
