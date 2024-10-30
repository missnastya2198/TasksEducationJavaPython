from selenium import webdriver
from selenium.webdriver.common.by import By
import time

#link = "http://suninjuly.github.io/registration2.html"
link = "http://suninjuly.github.io/registration1.html"

try:
    browser = webdriver.Chrome()
    browser.get(link)

    input1 = browser.find_element(By.CSS_SELECTOR, ".first_block>.first_class input")
    input1.send_keys("A")

    input2 = browser.find_element(By.CSS_SELECTOR, ".first_block>.second_class input")
    input2.send_keys("B")

    input3 = browser.find_element(By.CSS_SELECTOR, ".first_block>.third_class input")
    input3.send_keys("C")

    button = browser.find_element(By.CSS_SELECTOR, "button.btn")
    button.click()

    welcome_text_elt = browser.find_element(By.TAG_NAME, "h1")

    welcome_text = welcome_text_elt.text

    assert "Congratulations! You have successfully registered!" == welcome_text

finally:
    time.sleep(5)
    browser.quit()
