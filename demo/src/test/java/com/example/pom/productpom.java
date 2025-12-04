package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productpom {
    By p1=By.id("add-to-cart-sauce-labs-backpack");
    By removep1=By.id("remove-sauce-labs-backpack");

    
    WebDriver driver;

 public productpom(WebDriver driver ){
    this.driver=driver;
 }

public void ajouterProduit(){
    this.driver.findElement(p1).click();
}
public void supprimerProduit(){
    this.driver.findElement(removep1).click();
}

public WebElement getP1() {
    return this.driver.findElement(p1);
}

public WebElement getRemovep1() {
    
    return this.driver.findElement(removep1);
}
    
}
