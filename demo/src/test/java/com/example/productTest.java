package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.example.pom.loginPf;
import com.example.pom.productpom;

public class productTest {
@Test
@Tag("@regression")
public void prod(){
     URL grid;
    WebDriver driver= null;
    try {
       
        grid = new URL("http://172.17.0.2:4444");
    ChromeOptions co=new ChromeOptions();
     driver = new RemoteWebDriver(grid,co);
    } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
    loginPf lp=new loginPf(driver);
   
    productpom pp=new productpom(driver);
    String url=System.getProperty("url","https://www.saucedemo.com") ;// récuperation de la variable d'environnement
    driver.get(url);
   lp.saisirusername("standard_user");
   lp.saisirpassword("secret_sauce");
   lp.se_connecter();
   pp.ajouterProduit();
   assertTrue(pp.getRemovep1().isDisplayed());
   pp.supprimerProduit();
   assertTrue(pp.getP1().isDisplayed());


        
}
}
