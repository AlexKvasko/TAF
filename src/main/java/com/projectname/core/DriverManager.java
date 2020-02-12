package com.projectname.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();
    static {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver createDriver(){
        return new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return DRIVER.get();
    }





}
