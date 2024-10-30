from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import unittest
link = "http://suninjuly.github.io/registration1.html"
link2 = "http://suninjuly.github.io/registration2.html"
class TestReq(unittest.TestCase):
    def test_req_1(self):
                browser = webdriver.Chrome()
                browser.get(link)

                # Ваш код, который заполняет обязательные поля
                input1 = browser.find_element(By.CSS_SELECTOR, ".first_block .first")
                input1.send_keys("Ivan")
                input2 = browser.find_element(By.CSS_SELECTOR, ".first_block .second")
                input2.send_keys("Petrov")
                input3 = browser.find_element(By.CSS_SELECTOR, ".first_block .third")
                input3.send_keys("Smolensk")

                # Отправляем заполненную форму
                button = browser.find_element(By.CSS_SELECTOR, "button.btn")
                button.click()
                time.sleep(1)

                # находим элемент, содержащий текст
                welcome_text_elt = browser.find_element(By.TAG_NAME, "h1")
                # записываем в переменную welcome_text текст из элемента welcome_text_elt
                welcome_text = welcome_text_elt.text
                success_response = "Congratulations! You have successfully registered!"
                #print(success_response)
                browser.quit()
                # с помощью assert проверяем, что ожидаемый текст совпадает с текстом на странице сайта
                self.assertEqual( success_response, welcome_text, "something went wrong")
                
    def test_req_2(self):
                browser = webdriver.Chrome()
                browser.get(link2)

                # Ваш код, который заполняет обязательные поля
                input1 = browser.find_element(By.CSS_SELECTOR, ".first_block .first")
                input1.send_keys("Ivan")
                input2 = browser.find_element(By.CSS_SELECTOR, ".first_block .second")
                input2.send_keys("Petrov")
                input3 = browser.find_element(By.CSS_SELECTOR, ".first_block .third")
                input3.send_keys("Smolensk")

                # Отправляем заполненную форму
                button = browser.find_element(By.CSS_SELECTOR, "button.btn")
                button.click()
                time.sleep(1)

                # находим элемент, содержащий текст
                welcome_text_elt = browser.find_element(By.TAG_NAME, "h1")
                # записываем в переменную welcome_text текст из элемента welcome_text_elt
                welcome_text = welcome_text_elt.text
                success_response = "Congratulations! You have successfully registered!"
                #print(success_response)
                browser.quit()
                # с помощью assert проверяем, что ожидаемый текст совпадает с текстом на странице сайта
                self.assertEqual( success_response, welcome_text, "something went wrong")
                
            
    
if __name__ == "__main__": 
    unittest.main()