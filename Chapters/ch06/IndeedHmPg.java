package javaBasics;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IndeedHmPg {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/josep/Documents/N_Selenium/Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			String baseURL = "https://www.indeed.com/";
			driver.get(baseURL);
			System.out.println("HomePage title is: " + driver.getTitle());
			//driver.manage().window().maximize();
			Thread.sleep(1000);
			
			String keyword="QA Analyst";
			driver.findElement(By.id("text-input-what")).sendKeys(keyword);	
			String location="Irvine, CA";
			driver.findElement(By.id("text-input-where")).click();
			driver.findElement(By.id("text-input-where")).clear();
			driver.findElement(By.id("text-input-where"))
			.sendKeys(location);
			Thread.sleep(1000);
	
			//this auto-complete action, actually does click the FindJobs button//
			driver.findElement(By.id("text-input-where")).sendKeys(Keys.ENTER);			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			String expectedTitle = "QA Analyst Jobs, Employment in Irvine, CA | Indeed.com";
			String expectedMesg = "Page 1 of 293 jobs";	
			int expectSponsored = 6;
			
			if (expectedTitle.equals(driver.getTitle()) && 
			   (expectedMesg.equals(driver.findElement(By.id("searchCount")).getText())))	
			{			   
				System.out.println("Test is passed: " + driver.getTitle());	
				System.out.println("Test is passed: " + driver.findElement(By.id("searchCount")).getText());	
			}
			else
			{
				System.out.println("Test is failed");					
			}
		
			System.out.println("Sponsored listing: " +
				driver.findElements(By.className(" sponsoredGray ")).size());
			driver.close();
			
	}

}
