package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.HomeRepository;


public class LogintoWeb {
	
	static HomeRepository hr;

	    public static void main(String[] args) {
	    	hr = new HomeRepository();
	    	
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	    	
	        String baseUrl = "https://www.myteam11.com/";
		
	        // launch Chrome and direct it to the Base URL
	        driver.get(baseUrl);

	        // Verify the screen is redirected
	       // hr.VerifyHeader.isDisplayed();
	        System.out.println(" YE KHEL HAI JUNOON KA");
	       
	       
	        //close Browser
	        driver.close();
	       
	    }

	}


