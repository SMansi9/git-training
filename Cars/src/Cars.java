import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class Cars {
	public static void main (String args []) throws InterruptedException {
		
		
		WebDriver web = new FirefoxDriver();
		web.get("http://www.cars.com/");
		String s;
		
		s= web.getTitle();
		System.out.println(s);
		s = web.getCurrentUrl();
		System.out.println(s);

		//Test Case #1: 1.	Ability to select new, used, certified pre-owned preference
		
		/*web.findElement(By.xpath(".//a[@id='selSearchNEW']")).click();
		web.findElement(By.xpath(".//a[@id='selSearchUSED']")).click();
		web.findElement(By.xpath(".//a[@id-= 'selsearchCERTIFIED']")).click();
		
		//Test Case #2: Is option to choose different makers available?
		 
		web.findElement(By.xpath(".//select[@name= 'make']")).click();*/
		
		//Test case #3: Finding car dealership near 50 miles of zipcode 80602.
		/*web.findElement(By.xpath(".//*[@id='mkid_0']")).click();
		web.findElement(By.xpath(".//*[@id='searchwithin']")).click();
		web.findElement(By.xpath(".//*[@id='sc.zipCode']")).sendKeys("80602");
		web.findElement(By.xpath(".//input[@class='secondary dealer-search-submit']")).click();*/
		
		//Test case #4: Are reviews available from different users?
		//web.findElement(By.xpath(".//a[@class= 'readmore']")).click();
		
		//Test case #5: Sorting review from highest to lowest
		/*web.findElement(By.xpath(".//select[@id= 'sortBy']")).click();
		Select ratingdropdown = new Select( web.findElement(By.xpath(".//option[@value= 'highest-rated']")));
		ratingdropdown.selectByIndex(2);
		System.out.println("ratingdropdown");*/
		
		//Test case #6: Can you log in or create an account?
		/*web.findElement(By.xpath(".//a[@name= '&lid=header-log-in']")).click();
		web.findElement(By.xpath(".//a[@href= '/profile/secure/signup/']")).click();*/
		
		
		//Test case #7: Able to compare cars side by side
		/*web.findElement(By.xpath(".//a[@name='&lid=header-research']")).click();
		web.findElement(By.xpath(".//a[@class= 'compare-link']")).click();
		web.findElement(By.xpath(".//a[@href='/go/compare/index.jsp']")).click();
		web.findElement(By.xpath(".//select[@id='year_1a']")).click();
		Select yeardropdown = new Select( web.findElement(By.xpath(".//*[@id='year_1a']")));
		yeardropdown.selectByIndex(2);
		yeardropdown.getFirstSelectedOption().click();
		
		//Thread.sleep(1000);
		
		web.findElement(By.xpath(".//select[@id='division_1a']")).click();
		Select makersdropdown = new Select (web.findElement(By.xpath(".//select[@id='division_1a']")));
		makersdropdown.selectByVisibleText("Audi");
		
		web.findElement(By.xpath(".//select[@id='model_1a']")).click();
		Select modeldropdown = new Select (web.findElement(By.xpath(".//select[@id='model_1a']")));
		modeldropdown.selectByVisibleText("Q5 hybrid");
		
		web.findElement(By.xpath(".//select[@id='year_2a']")).click();
		Select year2dropdown = new Select( web.findElement(By.xpath(".//*[@id='year_2a']")));
		year2dropdown.selectByVisibleText("2015");
		
		web.findElement(By.xpath(".//select[@id='division_2a']")).click();
		Select makers2dropdown = new Select (web.findElement(By.xpath(".//select[@id='division_2a']")));
		makers2dropdown.selectByVisibleText("Acura");
		
		web.findElement(By.xpath(".//select[@id='model_2a']")).click();
		Select model2dropdown = new Select (web.findElement(By.xpath(".//select[@id='model_2a']")));
		model2dropdown.selectByVisibleText("ILX");

		web.findElement(By.xpath(".//a[@href= 'javascript:submitForm(this)']")).click();*/
		
		//Test Case #8: Searching for cars
		/*web.findElement(By.xpath(".//a[@id='selSearchNEW']")).click();
		web.findElement(By.xpath(".//*[@name = 'make']")).click();
		Select makersdropdown = new Select (web.findElement(By.xpath(".//select[@name = 'make']")));
		makersdropdown.selectByVisibleText("Ford");
		
		web.findElement(By.xpath(".//*[@id='div-model']")).click();
		Select modelsdropdown = new Select (web.findElement(By.xpath(".//*[@id='div-model']")));
		modelsdropdown.selectByVisibleText("C-Max Hybrid");
		
		web.findElement(By.xpath(".//*[@id='price-radius']/div[1]")).click();
		Select Pricedropdown = new Select (web.findElement(By.xpath(".//*[@id='price-radius']/div[1]")));
		Pricedropdown.deselectByIndex(5);
		
		web.findElement(By.xpath(".//*[@id='select-rd-new']")).click();
		Select Milesdropdown = new Select (web.findElement(By.xpath(".//*[@id='select-rd-new']")));
		Milesdropdown.deselectByIndex(2);
		
		web.findElement(By.xpath(".//*[@id='zc2']")).sendKeys("80602");

		web.findElement(By.xpath(".//*[@id='search-button']/a[1]")).click();*/
		
		
		//Test Case #9: can you return home from a different page by clicking cars.com icon
		
		//web.findElement(By.xpath(".//*[@id='page']/div[1]/div[4]/div/a/img")).click();
		
		//Test Case #10: Able to visit Service & Repair page
		
		web.findElement(By.xpath(".//a[@class='button secondary']")).click();
		

		
}
}