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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/img'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/span_(0)'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/span_Wishlist'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Wishlist/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Books/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Computers/a_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Electronics/a_Apparel  Shoes'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/a_Digital downloads'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Digital downloads/a_Jewelry'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Jewelry/a_Gift Cards'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Gift Cards/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Books/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Computers/a_Desktops'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Desktops/a_Notebooks'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Notebooks/a_Accessories'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Accessories/a_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Electronics/a_Camera, photo'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Camera, photo/a_Cell phones'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/a_Apparel  Shoes'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/a_Digital downloads'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Digital downloads/a_Jewelry'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Jewelry/a_Gift Cards'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Gift Cards/a_Tricentis'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Tricentis/a_About us'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. About Us/a_Contact us'))

WebUI.closeBrowser()

