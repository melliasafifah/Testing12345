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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    'melliaafifah15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'A1BeeIquRO1/7i/D4PgwXg==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Not you_pass'), 'A1BeeIquRO38IYqrGd+mdw==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_Not you_u_0_4_1m'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Not you_pass'), 'A1BeeIquRO1yttWVS8Kwcw==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_Not you_u_0_4_1q'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Not you_pass_1'), 'Malang151100')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Not you_pass'), 'A1BeeIquRO38IYqrGd+mdw==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_Not you_u_0_4_S'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/a_Forgotten password'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Please check your emails for a messag_6d8c97'), '925007')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'), 'Malang151100')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_(4) Facebook/span_Lanjutkan'))

