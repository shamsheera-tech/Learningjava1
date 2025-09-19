import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;

public class DynamicWaitExample {
    public static void main(String[] args) {

        // Set up ChromeDriver (make sure chromedriver is in your PATH or specify its location)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the target website
            driver.get("https://example.com");

            // Define the locator
            By locator = By.id("submit-btn");

            // Define the wait time (10 seconds)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for element to be present in the DOM
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));

            // Wait for element to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            // Wait for element to be clickable
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));

            // Perform the click action
            button.click();

            System.out.println("Element found and clicked successfully.");

        } catch (TimeoutException e) {
            System.out.println("Timeout: Element was not clickable within 10 seconds.");
        } finally {
            // Clean up
            driver.quit();
        }
    }
}