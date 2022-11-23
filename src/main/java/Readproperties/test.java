package Readproperties;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.1.3");
		driver = new ChromeDriver();
	}

}
