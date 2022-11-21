import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobPage {
    private WebDriver driver;

    private final By applyJobForm = By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/a");

    public JobPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyJobForm() {
        WebElement ApplyJobForm = driver.findElement(applyJobForm);
        ApplyJobForm.click();
    }
}
