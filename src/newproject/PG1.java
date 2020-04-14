package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome

//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {
	public static void main(String[] args) {
// declaration and instantiation of objects/variables
System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
WebDriver driver = new FirefoxDriver();
//comment the above 2 lines and uncomment below 2 lines to use Chrome

//System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver"); 
//WebDriver driver = new ChromeDriver();

driver.get("http://demo.guru99.com/test/newtours/");
String expectedTitle = "Welcome: Mercury Tours";
String actualTitle = driver.getTitle();
driver.manage().window().maximize();
/** compare the actual title of the page with the expected one and print
* the result as "Passed" or "Failed"*/
if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}
//close browser firefox/chrome
driver.close();
}
}



