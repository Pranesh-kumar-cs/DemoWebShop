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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/input_Qty_add-to-cart-button-31'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/p_The product has been added to your shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 14.1-inch Laptop/a_Simple Computer'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input_Qty_add-to-cart-button-75'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/p_Please select Processor'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input__product_attribute_75_5_31'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input_Software_product_attribute_75_8_35'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/input_Qty_add-to-cart-button-75'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/p_The product has been added to your shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Simple Computer/a_Blue and green Sneaker'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blue and green Sneaker/span_'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blue and green Sneaker/input_Qty_add-to-cart-button-28'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blue and green Sneaker/p_The product has been added to your shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blue and green Sneaker/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715596'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715594'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_Qty_itemquantity3715593'))

WebUI.closeBrowser()

