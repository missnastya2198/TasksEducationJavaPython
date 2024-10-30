import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import math


@pytest.fixture(scope="function")
def browser():
    print("\nstart browser for test..")
    browser = webdriver.Chrome()
    yield browser
    print("\nquit browser..")
    browser.quit()

class TestLogin():
    ar = ["895", "896","897", "898","899", "903","904", "905"]
    #ar = ["895"]
    @pytest.mark.parametrize('point', ar)
    def test_guest_should_see_login_link(self, browser, point):
    
        link = f"https://stepik.org/lesson/236{point}/step/1"
        browser.get(link)
        time.sleep(100)
        y = (str(math.log(int(time.time()))))
        input1 = browser.find_element(By.CSS_SELECTOR, ".textarea")
    
        input1.send_keys(y)
        print(y)
    
        button = browser.find_element(By.CSS_SELECTOR, ".submit-submission")
        button.click()

        time.sleep(2)

        text_elt = browser.find_element(By.CSS_SELECTOR, ".smart-hints__hint")
        # записываем в переменную welcome_text текст из элемента welcome_text_elt
        welcome_text = text_elt.text
        #print(welcome_text)
        success_response = "Correct!"
        #print(success_response)
   
        # с помощью assert проверяем, что ожидаемый текст совпадает с текстом на странице сайта
        assert success_response == welcome_text, "something went wrong"
