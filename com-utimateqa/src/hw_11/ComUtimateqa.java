package hw_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComUtimateqa {

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){ // my Firefox has error, it doesn't work for some reason
            driver =new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser");
        }

        // open url
        driver.get(baseUrl);

        //print the title of the page
        System.out.println("The Title of the page is : "+driver.getTitle());

        //Print the current URL
        System.out.println("The Current URL is : "+driver.getCurrentUrl());

        //Print the page source
        System.out.println("The Page source is : "+driver.getPageSource());

        // enter Email in Email field
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@gmail.com");

        // Enter Password in password field
        driver.findElement(By.name("user[password]")).sendKeys("prime2345");

        //Close Browser
        driver.close();

    }


}
