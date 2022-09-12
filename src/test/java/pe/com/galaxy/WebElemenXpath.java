package pe.com.galaxy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebElemenXpath extends BaseTest{
	
	@Test
	public void login() {
		
		String expected = "Facebook";
		
		//primera interfaz
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("button")).submit();
		
		
		
		//segunda interfaz
		
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']")).click();
		
		//tercera interfaz
		
		//para la interfaz de registros
		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-header-container']")));
		
		
		driver.findElement(By.name("firstname")).sendKeys("juan");
		driver.findElement(By.name("lastname")).sendKeys("perez");
		driver.findElement(By.name("reg_email__")).sendKeys("juan.perez@gmailperu.com");
		
		//botton save
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']")).click();
		

		
		
	}

}
