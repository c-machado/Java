import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.netflix.com/co/login");
        //browser.get(By.xpath(String.valueOf("//*[@id=\'formstart\']/button")));

        //browser.findElement(By.className("ui-text-input")).sendKeys("carolina");
        //browser.findElement(By.cssSelector(".login-input-email input")).sendKeys("dcmachadou@gmail.com");


        /*browser.findElement(By.cssSelector(".login-input-email input:first-of-type")).sendKeys("dcmachadou@gmail.com");
        browser.findElement(By.cssSelector("input[type='password']")).sendKeys("gabriel1031");*/
        browser.findElement(By.cssSelector(".login-button")).click();

        System.out.println(browser.findElement(By.cssSelector("#lbl-password .input-message")).getText());

        //browser.quit();
        //System.out.println(browser.getTitle());
        //Methods obj=new Methods();
        //System.out.println(obj.addTwoNumbers(3,4));
    }
}
