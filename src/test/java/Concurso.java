import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class Concurso {
    @Test
    void pageTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }

    @Test
    void pageTest2() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }

    @Test
    void pageTest3() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }

    @Test
    void pageTest4() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }

    @Test
    void pageTest5() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }

    @Test
    void pageTest6() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://padlet.com/direccionacademica40/qn63ippouic07xab/wish/2416070875");
        WebElement calificar = driver.findElement(By.cssSelector("span.text-body-extra-small.font-semibold.ms-1"));
        calificar.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.flex.flex-row.items-center")));//Espera a que las estrellas sean visibles
        WebElement primerContenedor = driver.findElement(By.cssSelector("div.flex.flex-row.items-center")); ///html/body/div[3]/main/div[4]/div[3]/div/div/i[5]
        WebElement estrellas = primerContenedor.findElement(By.xpath("//i[@aria-label='5 estrellas']"));

        estrellas.click();
        driver.close();
    }
}
