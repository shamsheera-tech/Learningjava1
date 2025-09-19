package ex_01_basicjava;


from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# Setup WebDriver (Chrome in this case)
public class seleniumcodingchallenge2 {

driver = webdriver.Chrome()

try:
        # Step 1: Navigate to login page
    driver.get("https://example.com/login")
    time.sleep(2)  # Let the page load

    # Step 2: Locate username and password fields
        username_field = driver.find_element(By.ID, "username")  # Adjust locator as needed
password_field = driver.find_element(By.ID, "password")

    # Step 3: Enter credentials
    username_field.send_keys("testuser")
    password_field.send_keys("testpass")

    # Step 4: Click login button
        login_button = driver.find_element(By.ID, "loginButton")
    login_button.click()

    # Step 5: Wait and verify navigation
    time.sleep(3)
    if "dashboard" in driver.current_url:
print("Login successful - navigated to dashboard")
    else:
print("Login failed or unexpected navigation")

finally:
        driver.quit()
