package hW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MoreCommonMethods;

import java.util.List;

public class HW13 extends MoreCommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/recruitment/viewCandidates";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement recruitTab=driver.findElement(By.xpath("//b[text()='Recruitment']/parent::a"));
        recruitTab.click();

        WebElement datePicker=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger'][1]"));
        datePicker.click();

        WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel1= new Select(month);
        sel1.selectByVisibleText("Aug");

       WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2 = new Select(year);
        sel2.selectByVisibleText("2035");

        boolean monthFound=false;
        while (!monthFound) {

            List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

            for (WebElement r1 : rows) {
                String currentDate = r1.getText();
                if (currentDate.equals("25")) {
                    r1.click();
                    System.out.println("You are on the right month");
                }
            }
            monthFound=true;
        }
    }
}
