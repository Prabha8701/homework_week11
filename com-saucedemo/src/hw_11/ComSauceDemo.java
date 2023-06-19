package hw_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComSauceDemo {
    static String baseUrl = "https://www.saucedemo.com/";

    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // open url
        driver.get(baseUrl);

        //Print title of the page
        System.out.println("The Page Title is : "+driver.getTitle());

        //Print the current url
        System.out.println("The Current URL is : "+driver.getCurrentUrl());

        //Print the page source
        System.out.println("The Page source is : "+driver.getPageSource());

        // enter username in username field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter Password in password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // close browser
        driver.close();

    }
}
