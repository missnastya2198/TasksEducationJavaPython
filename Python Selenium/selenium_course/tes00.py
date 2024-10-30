import pytest
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
import unittest


link = f"https://selenium1py.pythonanywhere.com/catalogue/coders-at-work_207/"
driver = webdriver.Chrome()
driver.get(link)
text_1 = driver.find_element(By.CLASS_NAME, "btn-add-to-basket")
print (text_1)
print ('fefeS')

