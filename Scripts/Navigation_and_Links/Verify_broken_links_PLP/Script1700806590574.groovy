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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_camera'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Products tagged with camera/a_1MP 60GB Hard Drive Handycam Camcorder'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. 1MP 60GB Hard Drive Han_396bab/a_Books'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Books/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/span_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Blog'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/a_July                                    (2)'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/a_asp.net'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/a_e-commerce'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/a_money'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/p_By Jayashree Pakhare (buzzle.com)'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Blog/a_nopCommerce'))

WebUI.closeBrowser()

