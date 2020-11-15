package com.opencart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverRepository {

    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    private static WebDriver webDriver;

    private DriverRepository() {

    }

    public static void downloadWebDriver() {WebDriverManager.chromedriver().setup();}

    public static void instanceWebBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(
                "--ignore-certificate-errors"
        );
        webDriver = new ChromeDriver(chromeOptions);
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {webDriver.quit();}
}
