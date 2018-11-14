/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyectoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author LuisBravo
 */
public class MiProyectoSelenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //Chrome
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Mozilla
        //System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

//TEST01: LOGIN        
//driver.navigate().to("http://the-internet.herokuapp.com/login");
//driver.manage().window().maximize();
//driver.findElement(By.id("username")).sendKeys("tomsmith");
//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//driver.findElement(By.className("radius")).click();   
//WebElement webElement = driver.findElement(By.id("flash"));
//String elemento = webElement.getText();
//System.out.println(elemento);


//TEST02: CARGA DINAMICA DE ELEMENTOS
//driver.navigate().to("http://the-internet.herokuapp.com/dynamic_loading/2");
//driver.manage().window().maximize();
//driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
//WebDriverWait wait = new WebDriverWait (driver, 20);
//WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
//String elemento = element.getText();
//System.out.println(elemento);
    }
}
