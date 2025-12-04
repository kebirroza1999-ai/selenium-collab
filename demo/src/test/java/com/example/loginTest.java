package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.pom.loginPf;

public class loginTest {
@Test
public void loginvalid(){
    WebDriver driver = new ChromeDriver();
    loginPf pf =new loginPf(driver);
    driver.get("https://www.saucedemo.com");
    pf.saisirusername("standard_user");
    pf.saisirpassword("secret_sauce");
    pf.se_connecter();
    assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
}
    
}
