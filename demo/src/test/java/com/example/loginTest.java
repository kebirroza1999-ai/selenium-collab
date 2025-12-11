package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.example.pom.loginPf;

public class loginTest {

@Test
@Tag("@integration")
public void loginvalid(){
    URL grid;
    WebDriver driver= null;
    try {
       
        grid = new URL("http://localhost:4444");
    ChromeOptions co=new ChromeOptions();
     driver = new RemoteWebDriver(grid,co);
    } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   
    loginPf pf =new loginPf(driver);
    String url=System.getProperty("url","https://www.saucedemo.com") ;// récuperation de la variable d'environnement
    driver.get(url);
    pf.saisirusername("standard_user");
    pf.saisirpassword("secret_sauce");
    pf.se_connecter();
    assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
}
    
}
