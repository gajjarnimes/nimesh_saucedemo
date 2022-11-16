package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest_4 {
    public static void main(String[] args) {
        String baseUrl="http://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        // create object
        WebDriver driver = new FirefoxDriver();
        // open URL
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
        usernameField.sendKeys("don@gmail.com");

        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("vijay46");
        // close the browser
        driver.quit();

    }
}
