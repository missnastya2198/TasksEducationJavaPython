import pytest
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.common.exceptions import NoSuchElementException


def test_link_language(browser):
    link = f"https://selenium1py.pythonanywhere.com/catalogue/coders-at-work_207/"
    browser.get(link)
    #button = len(browser.find_element(By.CLASS_NAME, "btn-add-to-basket1"))
    button =browser.find_element(By.CLASS_NAME, "btn-add-to-basket")
    #для проверки кнопки на французском  "Ajouter au panier"
    #time.sleep(5)

    #assert button > 0, 'No such element lalalalala'

