package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerce1 {

    static String browser= "Edge";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

    static WebDriver driver;

    public static void main(String[] args) {

        //Setup browser (I know it's not homework requirement)

        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver= new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        }else {
            System.out.println("Wrong browser");
        }

        // Open URL
        driver.get(baseUrl);

        //maximise the url
        driver.manage().window().maximize();

        // Print the title of the page
        System.out.println("Page title is : "+driver.getTitle());

        //  Print the current url
        System.out.println("The Current url is :"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("The Page Source is : "+driver.getPageSource());

        //Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("123456");

        // close the browser
        driver.close();
    }
}
