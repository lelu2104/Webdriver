import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\webdriverchrome\\chromedriver.exe"); //подключение драйвера
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by"); //открываем сайт onliner.by

        WebElement tv = driver.findElement(By.xpath("//span[text()='Телевизоры']")); //находим элемент
        tv.click();
        WebElement lg = driver.findElement(By.xpath("//ul[@class='schema-filter_list']//span[text()='LG']"));
        lg.click();
        WebElement samsung = driver.findElement(By.xpath("//ul[@class='schema-filter_list']//span[text()='Samsung']"));
        samsung.click();
        WebElement title = driver.findElement(By.xpath("//span[text()='LG']"));
        driver.quit();

    }
}
