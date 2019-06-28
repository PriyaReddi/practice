import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "E://practice//Sentara//src//main//resources//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://amazon.com");
	}

}
