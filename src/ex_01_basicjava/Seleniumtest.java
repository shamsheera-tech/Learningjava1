package ex_01_basicjava;

    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BasicWebDriverSetup {
        public static void main(String[] args) {
            // Set path to chromedriver if needed
            // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize Chrome driver
            WebDriver driver = new ChromeDriver();

            // Navigate to Google
            driver.get("https://www.google.com");

            // Maximize the window
            driver.manage().window().maximize();

            // Print the page title
            System.out.println("Page Title: " + driver.getTitle());

            // Close the browser
            driver.quit();
        }
    }
}
