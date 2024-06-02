package com.redbus;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
	public static WebDriver driver;
	 @Test
	 public void method1(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\pro\\drivers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("disable-notification");
	  options.addArguments("disable-popups");
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("https://www.redbus.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	 @Test
	 public void method2() {
	 WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
	 from.sendKeys("Thoothukudi");
	 WebElement froms= driver.findElement(By.xpath("//text[text()='Thoothukudi']"));
	 froms.click();
	 }
	 @Test
	 public void method3() {
	WebElement To= driver.findElement(By.xpath("//input[@id='dest']"));
	To.sendKeys("Chennai");
	 WebElement tos=driver.findElement(By.xpath("//text[text()='Chennai']"));
	 tos.click();
	  }
	 @Test
	 public void method4() {
	WebElement date= driver.findElement(By.xpath("//span[text()='2' and contains(@class,'fgdqFw')]"));
	date.click();
	  }
	 @Test
	 public void method5() {
	WebElement search= driver.findElement(By.xpath("//button[@id='search_button']"));
	search.click();
	 }
	 @Test
	 public void method6() {
	  WebElement time1=driver.findElement(By.xpath("//div[contains(text(),'22:15')]"));
	  String x=time1.getText();
	  WebElement rate=driver.findElement(By.xpath("//span[text()='1250']"));
	  String y=rate.getText();
	  WebElement name=driver.findElement(By.xpath("//div[contains(text(),'Bharat Benz A/C Seater /Sleeper (2+1)')]"));
	  String z=name.getText();
	  System.out.println(z + ""  +  x  + " " +  y);
		 driver.close();
	 }
}
