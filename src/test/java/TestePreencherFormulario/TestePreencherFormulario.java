package TestePreencherFormulario;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePreencherFormulario {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Mão Amiga/Downloads/chromedriver_win32_v96/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		// driver.quit();
	}

	@Test
	public void p() {

		// Abrindo o Brownser de Internet
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.navigate().refresh();

		// Maximisando a tela

		driver.manage().window().setSize(new Dimension(1382, 744));
		// Validação dos campos do Primeiro Formulario "Enter Vehicle Data"
		Assert.assertEquals(driver.findElement(By.cssSelector(".invalid > .main")).getText(), ("Make"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(1) > .field:nth-child(2) > .main")).getText(),
				("Engine Performance [kW]"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(1) > .field:nth-child(3) > .main")).getText(),
				("Date of Manufacture"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(1) > .field:nth-child(4) > .main")).getText(),
				("Number of Seats"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-select-one:nth-child(5) > .main")).getText(),
				("Fuel Type"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field-text:nth-child(6) > .main")).getText(),
				("List Price [$]"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(1) > .field:nth-child(7) > .main")).getText(),
				("License Plate Number"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field:nth-child(8) > .main")).getText(),
				("Annual Mileage [mi]"));
		{
			// Preenchendo o Primeiro Formulario "Enter Vehicle Data"
			WebElement dropdown = driver.findElement(By.id("make"));
			dropdown.findElement(By.xpath("//option[. = 'Nissan']")).click();
		}
		driver.findElement(By.id("engineperformance")).click();
		driver.findElement(By.id("engineperformance")).sendKeys("745");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("01/12/2021");
		driver.findElement(By.id("numberofseats")).click();
		{
			WebElement dropdown = driver.findElement(By.id("numberofseats"));
			dropdown.findElement(By.xpath("//option[. = '1']")).click();
		}
		driver.findElement(By.id("fuel")).click();
		{
			WebElement dropdown = driver.findElement(By.id("fuel"));
			dropdown.findElement(By.xpath("//option[. = 'Other']")).click();
		}
		driver.findElement(By.id("listprice")).click();
		driver.findElement(By.id("listprice")).sendKeys("15000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("EXB-3690");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		// Validação dos campos do Segundo Formulario "Enter Insurant Data"
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(1) > .main")).getText(),
				("First Name"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(2) > .main")).getText(),
				("Last Name"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(3) > .main")).getText(),
				("Date of Birth"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(4) > .main")).getText(),
				("Gender"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field-text:nth-child(5) > .main")).getText(),
				("Street Address"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(6) > .main")).getText(),
				("Country"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(7) > .main")).getText(),
				("Zip Code"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(2) > .field:nth-child(8) > .main")).getText(),
				("City"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field:nth-child(9) > .main")).getText(),
				("Occupation"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".field:nth-child(10) > .main")).getText(), ("Hobbies"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".field:nth-child(11) > .main")).getText(), ("Website"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".field:nth-child(12) > .main")).getText(), ("Picture"));
		// Preenchendo o Segundo Formulario "Enter Insurant Data"
		driver.findElement(By.id("firstname")).sendKeys("Euclides");
		driver.findElement(By.id("lastname")).sendKeys("Dias");
		driver.findElement(By.id("birthdate")).sendKeys("03/11/1982");
		driver.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) > .ideal-radio"))
				.click();
		driver.findElement(By.id("streetaddress")).sendKeys("China, 1590 Cs 2");

		{
			WebElement dropdown = driver.findElement(By.id("country"));
			dropdown.findElement(By.xpath("//option[. = 'Brazil']")).click();
		}
		driver.findElement(By.id("zipcode")).sendKeys("06852510");
		driver.findElement(By.id("city")).sendKeys("Itapecerica da Serra");
		driver.findElement(By.id("occupation")).click();
		{
			WebElement dropdown = driver.findElement(By.id("occupation"));
			dropdown.findElement(By.xpath("//option[. = 'Employee']")).click();
		}
		driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();
		driver.findElement(By.id("nextenterproductdata")).click();
		// Validando os campos do Terceiro Formulario "Enter Product Data"
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealsteps-step:nth-child(3) > .idealforms-field-text > .main"))
						.getText(),
				("Start Date"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-select-one:nth-child(2) > .main")).getText(),
				("Insurance Sum [$]"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-select-one:nth-child(3) > .main")).getText(),
				("Merit Rating"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(3) > .field:nth-child(4) > .main")).getText(),
				("Damage Insurance"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-checkbox:nth-child(5) > .main")).getText(),
				("Optional Products"));
		Assert.assertEquals(driver
				.findElement(By.cssSelector(".idealsteps-step:nth-child(3) > .field:nth-child(6) > .main")).getText(),
				("Courtesy Car"));
		// Preenchendo o Terceiro Formulario "Enter Product Data"
		driver.findElement(By.id("startdate")).sendKeys("05/02/2022");
		driver.findElement(By.id("insurancesum")).click();
	    {
	      /*WebElement dropdown = driver.findElement(By.id("insurancesum"));
	      dropdown.findElement(By.xpath("//option[. = '35.000.000,00']")).click();
	    //*[@id="insurancesum"]/option[2]*/
	    }
	        
	    
		driver.findElement(By.id("meritrating")).click();
		{
			WebElement dropdown = driver.findElement(By.id("meritrating"));
			dropdown.findElement(By.xpath("//option[. = 'Bonus 3']")).click();
		}
		driver.findElement(By.id("damageinsurance")).click();
		{
			WebElement dropdown = driver.findElement(By.id("damageinsurance"));
			dropdown.findElement(By.xpath("//option[. = 'Full Coverage']")).click();
		}
		driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(2) > .ideal-check"))
				.click();
		driver.findElement(By.id("courtesycar")).click();
		{
			//WebElement dropdown = driver.findElement(By.id("courtesycar"));
			//dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
		}
		driver.findElement(By.id("nextselectpriceoption")).click();
		// Validando os campos do Quarto Formulario "Enter Select Price Option"
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#priceTable tr:nth-child(1) > td:nth-child(1)")).getText(),
				("Price per Year ($)"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#priceTable tr:nth-child(2) > td:nth-child(1)")).getText(),
				("Online Claim"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#priceTable tr:nth-child(3) > td:nth-child(1)")).getText(),
				("Claims Discount (%)"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#priceTable tr:nth-child(4) > td:nth-child(1)")).getText(),
				("Worldwide Cover"));
		Assert.assertEquals(driver.findElement(By.cssSelector("tfoot th:nth-child(1)")).getText(), ("Select Option"));
		Assert.assertEquals(driver.findElement(By.cssSelector("#priceTable th:nth-child(2)")).getText(), ("Silver"));
		Assert.assertEquals(driver.findElement(By.cssSelector("#priceTable > thead th:nth-child(3)")).getText(),
				("Gold"));
		Assert.assertEquals(driver.findElement(By.cssSelector("#priceTable th:nth-child(4)")).getText(), ("Platinum"));
		Assert.assertEquals(driver.findElement(By.cssSelector("#priceTable th:nth-child(5)")).getText(), ("Ultimate"));
		driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".col-lg-5 .big-quote-cell")).getText(), ("VIEW QUOTE"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".col-lg-6 .big-quote-cell")).getText(),
				("DOWNLOAD QUOTE"));
		driver.findElement(By.id("nextsendquote")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field-email > .main")).getText(),
				("E-Mail"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#sendQuoteForm > .field:nth-child(2) > .main")).getText(),
				("Phone"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector("#sendQuoteForm > .field:nth-child(3) > .main")).getText(),
				("Username"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-password:nth-child(4) > .main")).getText(),
				("Password"));
		Assert.assertEquals(
				driver.findElement(By.cssSelector(".idealforms-field-password:nth-child(5) > .main")).getText(),
				("Confirm Password"));
		Assert.assertEquals(driver.findElement(By.cssSelector(".idealforms-field-textarea > .main")).getText(),
				("Comments"));

		// Preenchendo os campos do Quarto Formulario "Enter Select Price Option"
		driver.findElement(By.id("email")).sendKeys("euclides.dias13@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("11959032017");
		driver.findElement(By.id("username")).sendKeys("euclides.dias");
		driver.findElement(By.id("password")).sendKeys("Cli1453dao");
		driver.findElement(By.id("confirmpassword")).sendKeys("Cli1453dao");
		driver.findElement(By.id("Comments")).sendKeys("Adorei o test");
		driver.findElement(By.id("sendemail")).click();
		// Valindo a mensagem de Login
		{
			List<WebElement> elements = driver.findElements(By.id("LoadingPDF"));
			assert (elements.size() > 0);
		}
// Validando a Mensagem de envio de email confirmado
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), ("Sending e-mail success!"));
		driver.findElement(By.cssSelector(".confirm")).click();

	}
}
