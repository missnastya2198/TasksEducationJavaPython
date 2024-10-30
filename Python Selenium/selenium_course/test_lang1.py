import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

'''@pytest.fixture(scope="function")
def browser():
    print("\nstart browser for test..")
    browser = webdriver.Chrome()
    yield browser
    print("\nquit browser..")
    browser.quit()'''


def test_link(browser):
    link = f"https://selenium1py.pythonanywhere.com/catalogue/coders-at-work_207/"
    browser.get(link)
    browser.find_element(By.CLASS_NAME, "btn-add-to-basket")
    assert  "no button"