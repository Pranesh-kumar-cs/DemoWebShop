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

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'testabcxyz1234@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/input_You have no items in your shopping ca_bc5dba'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms of service and_f529a0'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/h1_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/h2_Billing address'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.City'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '41', true)

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.City'), 'hyderabad')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    'office')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Address 2_BillingNewAddress.Address2'), 
    'HOme')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
    '500055')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    '912345678')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/h2_Shipping address'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/h2_Shipping method'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/p_You will pay by COD'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/h2_Confirm order'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/strong_Your order has been successfully processed'))

WebUI.closeBrowser()

