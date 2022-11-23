package Readproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readprop {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		Properties prop=new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Vinay\\Desktop\\Vinay Patil\\Selenium\\"
		+"javaprograms\\Einvoicing\\src\\main\\java\\Readproperties\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("pass"));
		
	    //String browsername=prop.getProperty("browser");
	    
	    //if(browsername.equals("chrome"));{
	    	//System.setProperty("webdriver.chrome.driver", "C:/Users/Vinay/.m2/repository/org/seleniumhq/selenium/selenium-api/4.1.2/selenium-api-4.1.2-sources.jar");
	    	
	    	//driver=new ChromeDriver();
	   // }
	   // System.out.println("hi");
	//}
		
	

}}
