package hw_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComHeroKuapp {
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;
    static String browser = "Chrome";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) { // MyFirefox is giving error so please don't run this for firefox
            driver=new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser");
        }
        // Open URL
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The Page Title is : "+driver.getTitle());

        //Print the current url
        System.out.println( "The Current Url is : "+driver.getCurrentUrl());

        //print the page source
        System.out.println("The Page Source is : "+driver.getPageSource());

        // Enter the email to username field
       driver.findElement(By.id("username")).sendKeys("Prime123@gmail.com");

       //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("abcdefg");

        //close the browser
        driver.close();

    }
}
