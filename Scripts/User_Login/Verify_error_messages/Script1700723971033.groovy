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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/span_Login was unsuccessful. Please correct_c76db1'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/li_No customer account found'), '')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'abc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '9NLz+4tGZcQ=')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/form_Login was unsuccessful. Please correct_a523a5'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/span_Please enter a valid email address'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '1zdhRLj/Jjs=')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/span_Login was unsuccessful. Please correct_c76db1'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Login/li_No customer account found'), '')

WebUI.closeBrowser()

