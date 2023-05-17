package com.webmath.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebMathTc {
	WebDriver driver;

	@BeforeClass
	public void beforeTestExecution() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.webmath.com/");
	}

	@AfterClass
	void afterTestExecution() {
		driver.quit();
	}

	@Test(priority = 1)
	public void EverydayMath() {
		try {
			// Click on the Math for Everyone title box
			driver.findElement(By.linkText("Math for Everyone")).click();
			Thread.sleep(2000);
			// Click on the Figuring a tip link
			driver.findElement(By.linkText("Figuring a tip")).click();
			Thread.sleep(2000);
			// Clear default text in the text box
			driver.findElement(By.name("param0")).clear();
			Thread.sleep(2000);
			// Enter value in the text box
			driver.findElement(By.name("param0")).sendKeys("10");
			Thread.sleep(2000);
			// Enter value in the Text box
			driver.findElement(By.name("param1")).sendKeys("2500");
			Thread.sleep(2000);
			// Click on Figure tip button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			// Click on Sale price
			driver.findElement(By.linkText("Sale price")).click();
			Thread.sleep(2000);
			// Enter value in the text box
			driver.findElement(By.name("param0")).sendKeys("15000");
			Thread.sleep(2000);
			// Enter value in the text box
			driver.findElement(By.name("param1")).sendKeys("5");
			Thread.sleep(2000);
			// Click on Figure cost button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test(priority = 2)
	public void UnitConversion() {
		try {
			// Click on Math for Everyone
			driver.findElement(By.linkText("Math for Everyone")).click();
			Thread.sleep(2000);

			// Click on Length
			driver.findElement(By.linkText("Length")).click();
			Thread.sleep(2000);
			// Enter value in the textbox
			driver.findElement(By.name("param0")).sendKeys("1");
			Thread.sleep(2000);
			// Select Convert option from dropdown list
			WebElement dropdown = driver.findElement(By.name("param1"));
			Select option = new Select(dropdown);
			option.selectByVisibleText("meter(s)");
			Thread.sleep(2000);
			// Select Convert option
			WebElement dropdownlist = driver.findElement(By.name("param2"));
			Select currentoption = new Select(dropdownlist);
			currentoption.selectByVisibleText("centimeter(s)");
			Thread.sleep(2000);
			// Click on Convert it button
			driver.findElement(By.xpath("//input[@value='Convert']")).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			// Click on Mass Link
			driver.findElement(By.linkText("mass")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("param0")).sendKeys("1000");
			Thread.sleep(2000);
			// Select Convert
			WebElement Massconvert1 = driver.findElement(By.name("param1"));
			Select Massoption1 = new Select(Massconvert1);
			Massoption1.selectByVisibleText("gram(s)");
			Thread.sleep(2000);
			// Select Convert
			WebElement Massconvert2 = driver.findElement(By.name("param2"));
			Select Massoption2 = new Select(Massconvert2);
			Massoption2.selectByVisibleText("kilogram(s)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Convert']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			// Click on Area Link
			driver.findElement(By.linkText("area")).click();
			Thread.sleep(2000);
			// Click on text box
			driver.findElement(By.name("param0")).sendKeys("1");
			Thread.sleep(2000);
			// Select area conversion option
			WebElement Areaconvert1 = driver.findElement(By.name("param1"));
			Select Areaoption1 = new Select(Areaconvert1);
			Areaoption1.selectByVisibleText("square meter(s)");
			Thread.sleep(2000);
			// Select Area to Convert into
			WebElement Areaconvert2 = driver.findElement(By.name("param2"));
			Select Areaoption2 = new Select(Areaconvert2);
			Areaoption2.selectByVisibleText("square centimeter(s)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Convert']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}

	@Test(priority = 3)
	public void PersonalFinances() {
		try {
			// Click on Math for Everyone
			driver.findElement(By.linkText("Math for Everyone")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Simple Interest")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("principal")).sendKeys("100000");
			Thread.sleep(2000);
			driver.findElement(By.name("interest")).sendKeys("12");
			Thread.sleep(2000);
			WebElement interestunit1 = driver.findElement(By.name("interest_units"));
			Select unit1 = new Select(interestunit1);
			unit1.selectByVisibleText("Year (annual interest)");
			Thread.sleep(2000);
			// Select interest
			driver.findElement(By.name("desired_time")).sendKeys("3");
			Thread.sleep(2000);
			// Interest after --time
			WebElement interestunit2 = driver.findElement(By.name("desired_time_units"));
			Select unit2 = new Select(interestunit2);
			unit2.selectByVisibleText("Year(s) (annually)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			// Click on Compound Interest
			driver.findElement(By.linkText("Compound Interest")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("principal")).sendKeys("100000");
			Thread.sleep(2000);
			driver.findElement(By.name("interest")).sendKeys("12");
			Thread.sleep(2000);
			driver.findElement(By.name("compound")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.name("desired_time")).sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(By.name("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
     @Test(priority = 4)
	public void GeneralMath() {
		try {
			// Click on General Math
			driver.findElement(By.linkText("General Math")).click();
			Thread.sleep(2000);
			
			// Click on Factor link
			driver.findElement(By.linkText("Factor")).click();
			Thread.sleep(2000);
			WebElement factor = driver.findElement(By.name("param0"));
			Select option = new Select(factor);
			option.selectByIndex(1);
			Thread.sleep(2000);
			driver.findElement(By.name("param1")).sendKeys("25");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Click on Fraction to Decimal
			driver.findElement(By.linkText("Fraction to Decimal")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("top")).clear();
			driver.findElement(By.name("top")).sendKeys("1");
			Thread.sleep(2000);
			WebElement bottom =driver.findElement(By.name("bottom"));
			bottom.clear();
			bottom.sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.name("dplaces")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Convert it']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Click on Decimal to Fraction
			driver.findElement(By.linkText("Decimal to Fraction")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ftDecimalToFract")).sendKeys("0.007");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			
		    //Click on Reduce link
			driver.findElement(By.linkText("Reduce")).click();
			Thread.sleep(2000);
			WebElement top=driver.findElement(By.name("top"));
			top.clear();
			top.sendKeys("500");
			Thread.sleep(2000);
			WebElement bottom2=driver.findElement(By.name("bottom"));
			bottom2.clear();
			bottom2.sendKeys("1000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Reduce it']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Click on Add Link
			driver.findElement(By.linkText("Add")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("btop1")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.name("bwhole1")).sendKeys("2");
			Thread.sleep(1000);
			driver.findElement(By.name("bbottom1")).sendKeys("100");
			Thread.sleep(1000);
			driver.findElement(By.name("btop2")).sendKeys("20");
			Thread.sleep(1000);
			driver.findElement(By.name("bbottom2")).sendKeys("50");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Add']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Clear the Entire Form']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Click on Subtract link
			driver.findElement(By.linkText("Subtract")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("ctop1")).sendKeys("3");
			Thread.sleep(1000);
			driver.findElement(By.name("cwhole1")).sendKeys("15");
			Thread.sleep(1000);
			driver.findElement(By.name("cbottom1")).sendKeys("30");
			Thread.sleep(1000);
			driver.findElement(By.name("ctop2")).sendKeys("5");
			Thread.sleep(1000);
			driver.findElement(By.name("cwhole2")).sendKeys("20");
			Thread.sleep(1000);
			driver.findElement(By.name("cbottom2")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Subtract']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Clear the Entire Form']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			} catch (Exception e) {

		}
	}
    @Test(priority = 5)
	public void K_8Math() {
		try {
			//Click on K-8 Math
			driver.findElement(By.linkText("8th Grade Math")).click();
			Thread.sleep(2000);
			//Click on What's a fraction? link
			driver.findElement(By.linkText("What's a Fraction?")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("n")).sendKeys("9");
			Thread.sleep(2000);
			driver.findElement(By.name("d")).sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='What is a fraction?']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Click on Comparing Fraction
			driver.findElement(By.linkText("Comparing Fractions")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("n1")).sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(By.name("d1")).sendKeys("4");
			Thread.sleep(2000);
			driver.findElement(By.name("n2")).sendKeys("8");
			Thread.sleep(2000);
			driver.findElement(By.name("d2")).sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Which one is larger?']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			} catch (Exception e) {

		}
	}
    @Test(priority = 6)
    public void Algebra() {
    	try {
     		//Click on Algebra Link
    		driver.findElement(By.linkText("Algebra")).click();
    		Thread.sleep(2000);
    		//Click on Power Link
    		driver.findElement(By.linkText("Powers")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.name("s")).clear();
    		Thread.sleep(1000);
    		driver.findElement(By.name("s")).sendKeys("25^9");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@value='Click here to simplify']")).click();
    		Thread.sleep(2000);
    		driver.navigate().back();
    		driver.navigate().back();
    		Thread.sleep(2000);
    		
    		//Click on Square roots
    		driver.findElement(By.linkText("Square roots")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.name("s")).sendKeys("225^3");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@value='Simplify']")).click();
    		Thread.sleep(2000);
    		driver.navigate().back();
    		Thread.sleep(2000);
    		driver.navigate().back();
    		Thread.sleep(2000);
    		
    	
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
    @Test(priority = 7)
    public void footerlink() {
    	try {
    		//Click on Footer link
    		driver.findElement(By.linkText("Home")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("Contact Us")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("About WebMath")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("Why WebMath")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("Website Map")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("Home")).click();
    		Thread.sleep(2000);
    		
    		//Drop down list selection
    		WebElement topicItemselect =driver.findElement(By.name("topicItem"));
    		Select option =new Select(topicItemselect);
    		option.selectByVisibleText("Numbers, Rounding");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("(//img[@align='top'])[1]")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("12345");
    		Thread.sleep(2000);
    		WebElement rounding =driver.findElement(By.name("roundto"));
    		Select roundingoption=new Select(rounding);
    		roundingoption.selectByVisibleText("thousands");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@value='Round it!']")).click();
    		Thread.sleep(2000);
    		driver.navigate().back();
    		Thread.sleep(1000);
    		driver.navigate().back();
    		Thread.sleep(2000);
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }

}
