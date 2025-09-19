package ex_01_basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormAutomation {
    public static void main(String[] args) {

        // Launch ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open the login page
            driver.get("https://example.com/login");

            // 2. Locate and fill the username field
            WebElement usernameField = driver.findElement(By.id("username"));  // Adjust locator if needed
            usernameField.sendKeys("testuser");

            // 3. Locate and fill the password field
            WebElement passwordField = driver.findElement(By.id("password"));  // Adjust locator if needed
            passwordField.sendKeys("testpass");

            // 4. Click the login button
            WebElement loginButton = driver.findElement(By.id("login-button"));  // Adjust locator if needed
            loginButton.click();

            // 5. Confirm navigation (example: check for dashboard element or title)
            Thread.sleep(2000);  // Better to use WebDriverWait in real-world tests

            if (driver.getCurrentUrl().contains("dashboard")) {
                System.out.println("Login successful - navigated to dashboard");
            } else {
                System.out.println("Login failed or navigation unsuccessful");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}