package com.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPf {
    WebDriver driver;
    @FindBy(id="user-name")
    WebElement username ;
     @FindBy(id="password")
    WebElement password ;
     @FindBy(id="login-button")
    WebElement login ;
     @FindBy(css="[data-test=error]")
    WebElement error ;
    public loginPf (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void saisirusername(String u){
        this.username.sendKeys(u);

    }
     public void saisirpassword(String p){
        this.password.sendKeys(p);

    }
     public void se_connecter(){
        this.login.click();

    }
    

        
    }

    
    
    

