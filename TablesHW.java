package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.MoreCommonMethods;

import java.util.List;

public class TablesHW extends MoreCommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i<row.size();i++){
            String id = row.get(i).getText();
            if(id.equals("56258A")){
                WebElement idText=driver.findElement(By.xpath("//table/tbody/tr/td["+(i+1)+"]"));
                System.out.println(idText.getText());

            }
        }
    }
}
