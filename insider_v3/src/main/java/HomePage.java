import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private final By cookieAcceptButton = By.id("wt-cli-accept-all-btn");
    private final By moreMenu = By.xpath("//div[2]/div/ul[1]/li[6]/a/span");
    private final By careers = By.xpath("//li[6]/div/div[1]/div[3]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void cookiesAccepted() {
        WebElement cookieAccept = driver.findElement(cookieAcceptButton);
        cookieAccept.click();
    }

    public void moreDropDown() {
        WebElement MoreMenu = driver.findElement(moreMenu);
        MoreMenu.click();
    }

    public void careersPage() {
        WebElement Careers = driver.findElement(careers);
        Careers.click();
    }
}
