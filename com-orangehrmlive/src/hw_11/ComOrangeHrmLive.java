package hw_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComOrangeHrmLive {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        WebDriver driver;

        String browser = "Chrome";

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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // As Programme was not running I had to use Timeout

        //Print the title of the page
        System.out.println("The Page Title is : " + driver.getTitle());

        // print the current url
        System.out.println("The current page URL is : " + driver.getCurrentUrl());

        // print the page source
        System.out.println("The Page Source is : " + driver.getPageSource());

        //Enter username in username field
        driver.findElement(By.name("username")).sendKeys("Admin");

        // enter password in password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Close Browser
        driver.close();

    }
}
