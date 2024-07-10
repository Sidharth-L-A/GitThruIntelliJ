package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Trial {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SIDHARTH\\New folder\\Google Chrome\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Chrome Driver Located");

        ChromeOptions cops = new ChromeOptions();
        cops.setBinary("\\SIDHARTH\\New folder\\Google Chrome\\Chrome Browser\\Test Browser\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver(cops);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Chrome opened");

        driver.get("https://www.washingtonpost.com/");
        System.out.println("Washington Post Page opened");

        driver.quit();
        System.out.println("Driver Quit");
    }
}