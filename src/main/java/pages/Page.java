package pages;

import org.openqa.selenium.By;

public class Page extends PageInstances {
    public By equal = By.id("equals");
    public By resultText = By.id("display");

    public By numberSelector (String num) {
        return By.xpath("//div[@id='buttons']//div[contains(text(),'" + num + "')]");
    }

    public By operatorSelector (String operator) {
        return By.xpath("//div[@id='buttons']//div[contains(text(),'" + operator + "')]");
    }
}
