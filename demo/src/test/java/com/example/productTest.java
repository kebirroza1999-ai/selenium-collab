package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.example.pom.loginPf;
import com.example.pom.productpom;

public class productTest {
@Test
@Tag("@regression")
public void prod(){
    WebDriver driver= new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
    loginPf lp=new loginPf(driver);
    productpom pp=new productpom(driver);
   driver.get("https://www.saucedemo.com/");
   lp.saisirusername("standard_user");
   lp.saisirpassword("secret_sauce");
   lp.se_connecter();
   pp.ajouterProduit();
   assertTrue(pp.getRemovep1().isDisplayed());
   pp.supprimerProduit();
   assertTrue(pp.getP1().isDisplayed());


        
}
}
