package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MultiBrowserTest_4 {
    static String browser = "Edge";
    static String baseUrl="http://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chorme")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("wrong browser name");
            // Open URL
            driver.get(baseUrl);

            // Print the title of the page
            String title = driver.getTitle();
            System.out.println("Page title is:"+title);

            // Print the current Url
            System.out.println("current url:"+driver.getCurrentUrl());

            // Print the page source
            System.out.println("Page source:"+driver.getPageSource());
            //Enter the username to username field element
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("vivan@yahoo.com");

            // Enter the password to password field element
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("virat180");
            // close the browser
            driver.quit();
        }
    }



}


