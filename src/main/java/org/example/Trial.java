package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Trial {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SIDHARTH\\New folder\\Google Chrome\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Chrome Driver Located");

        ChromeOptions cops = new ChromeOptions();
        cops.setBinary("\\SIDHARTH\\New folder\\Google Chrome\\Chrome Browser\\Test Browser\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver(cops);
        System.out.println("Chrome opened");

        driver.get("https://www.washingtonpost.com/");
        System.out.println("Washington Post Page opened");

        driver.quit();
        System.out.println("Driver Quit");
    }
}