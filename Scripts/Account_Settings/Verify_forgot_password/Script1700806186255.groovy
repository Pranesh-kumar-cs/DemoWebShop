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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/div_Register            Log in             _a02d7a'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'testabcxyz1234@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/a_Forgot password'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Password Recovery/div_Your email address'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Password Recovery/label_Your email address'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Password Recovery/input_Your email address_Email'), 
    'testabcxyz1234@test.com')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Password Recovery/input__send-email'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Password Recovery/div_Email with instructions has been sent to you'))

WebUI.closeBrowser()

