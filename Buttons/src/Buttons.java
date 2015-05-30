import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class Buttons {
	public static void main (String args []) {

	WebDriver web = new FirefoxDriver();
	web.get("http://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
	String s;
	
	s= web.getTitle();
	System.out.println(s);
	s = web.getCurrentUrl();
	System.out.println(s);

	web.findElement(By.xpath("//input[@id='one']")).isSelected();
	System.out.println(web.findElement(By.xpath("//input[@id='one']")).isSelected());
	web.findElements(By.xpath("//input[@name='sample']")).size();
	System.out.println(web.findElements(By.xpath("//input[@name='sample']")).size());
	

}
}