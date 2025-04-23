package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        // Set up the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Wait for the page to load
        Thread.sleep(2000);

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        // Click the login button
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        // Quit the browser
        driver.quit();
    }
}
