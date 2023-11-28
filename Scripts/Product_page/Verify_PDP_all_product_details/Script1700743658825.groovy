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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_14.1-inch Laptop'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/h1_14.1-inch Laptop'), '14.1-inch Laptop')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/div_Unique Asian-influenced imprint wraps t_b0e2f0'), 
    'Unique Asian-influenced imprint wraps the laptop both inside and out')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/span_In stock'), 'In stock')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/div_1590.00'), '1590.00')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/p_Optimize your mobility with a BrightView _19f580'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/div_Products specifications                _a12a8c'), 
    0)

WebUI.closeBrowser()

