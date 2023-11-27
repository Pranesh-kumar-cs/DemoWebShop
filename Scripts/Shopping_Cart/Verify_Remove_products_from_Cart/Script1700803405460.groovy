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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'testabcxyz1234@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_14.1-inch Laptop'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/input_Qty_add-to-cart-button-31'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/a_Simple Computer'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input__product_attribute_75_5_31'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input_Image Viewer_product_attribute_75_8_35'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input_Qty_add-to-cart-button-75'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715593'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715593'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/th_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715593'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/span_Shopping cart'))

WebUI.closeBrowser()

