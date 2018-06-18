package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Strings {

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/josep/Documents/N_Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		String baseURL = "https://www.indeed.com/"; 
		driver.get(baseURL);
		Thread.sleep(1000);
		
		String expectedTitle = "Job SEARCH | Indeed";
		if(expectedTitle.equalsIgnoreCase(driver.getTitle()))  
		{
			//if condition is true, execute this step
			System.out.println("Test is passed");
		}
		else
		{
			//if condition is false, execute this step
			System.out.println("Test failed");
		}
		//boolean - return true or false
		System.out.println(driver.getTitle().contains("Search"));
		System.out.println(driver.getTitle().startsWith("Job Search"));
		System.out.println(driver.getTitle().endsWith("| Indeed"));
		
		//To convert numbers in Strings to actual numbers
		String searchCount = "There are 1,304 results";
		//searchCount.replaceAll("\\D", "")
		//Integer.parseInt(searchCount.replaceAll("\\D", ""))
		int sc = Integer.parseInt(searchCount.replaceAll("\\D", ""));
		System.out.println(sc);
		
		//in order to deal with Double
		//Double.parseDouble(s)
		
		driver.close();
		
	}

}
