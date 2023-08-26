package asd;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	public static void main(String[] args)
	{
		WebDriver d=new ChromeDriver();
		
	((JavascriptExecutor)d).executeScript("alert('Hi')");
((JavascriptExecutor)d).executeScript("window.scrollTo(0,document.body.scrollHeight)");
((JavascriptExecutor)d).executeScript("window.scrollTo(document.body.scrollHeight,0)");




((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();", webelement);
		
	}
	
}
