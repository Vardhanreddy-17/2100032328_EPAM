package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class opengithubaccount {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://github.com/login");
        System.out.println(driver.getTitle());
        // Username
        driver.findElement(By.id("login_field")).sendKeys("Vardhanreddy-17");
        driver.findElement(By.id("password")).sendKeys("********");
        driver.findElement(By.name("commit")).submit();
    }
}
