package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeBrowserTest_4 {
    public static void main(String[] args) {
        String baseUrl="http://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get(baseUrl);
        // print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);
        // print the current url
        System.out.println("current url"+driver.getCurrentUrl());
        // print the page source
        System.out.println("page source"+driver.getPageSource());
        // Enter the username  to username field element
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("suhan@gmail.com");

        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("roshani980");

        // close the browser
        driver.quit();







    }
}
