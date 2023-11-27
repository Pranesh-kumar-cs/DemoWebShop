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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_First name_FirstName'), 'Pranesh')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Last name_LastName'), 'kumar')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Email_Email'), 'testabcxyz1234@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Password_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Confirm password_ConfirmPassword'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input__register-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Register/li_The specified email already exists'), 
    '')

WebUI.closeBrowser()

