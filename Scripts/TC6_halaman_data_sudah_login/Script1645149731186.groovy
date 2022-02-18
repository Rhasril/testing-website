import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://qa-interview.srcli.xyz/login')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('login_page/input_page/input_username'), 'root')

WebUI.setText(findTestObject('login_page/input_page/input_password'), 'root123')

WebUI.click(findTestObject('login_page/button_login'))

WebUI.verifyElementPresent(findTestObject('main_page/home_page'), 0)

WebUI.navigateToUrl('http://qa-interview.srcli.xyz/data')

WebUI.delay(3)

WebUI.scrollToPosition(0, 200)

if (true) {
    WebUI.verifyElementPresent(findTestObject('data_page/h1_Pemasukan'), 0)

    WebUI.verifyElementPresent(findTestObject('data_page/h1_Pengeluaran'), 0)

    WebUI.verifyElementPresent(findTestObject('data_page/form_start_end'), 0)
}

WebUI.closeBrowser()
