import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/button_Login'))

WebUI.getUrl()

WebUI.verifyMatch('https://katalon-demo-cura.herokuapp.com/#appointment', 'https://katalon-demo-cura.herokuapp.com/#appointment', 
    true)

WebUI.verifyTextPresent('Make Appointment', true)

WebUI.verifyTextPresent('Facility', true)

WebUI.verifyOptionPresentByValue(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Facility'), 
    'Tokyo CURA Healthcare Center', true, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Facility'), 
    'Hongkong CURA Healthcare Center', true, 1)

WebUI.verifyOptionPresentByValue(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Facility'), 
    'Seoul CURA Healthcare Center', true, 2)

WebUI.selectOptionByValue(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyTextPresent('Apply for hospital readmission', true)

WebUI.check(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/ReadmissionChckbox'))

WebUI.verifyElementChecked(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/ReadmissionChckbox'), 
    0)

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Healthcare Program'), 
    'Healthcare Program')

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Medicare'), 
    'Medicare')

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Medicaid'), 
    'Medicaid')

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_None'), 
    'None')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Visit Date (Required)'), 
    'Visit Date (Required)')

WebUI.setText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    '30/6/2019')

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/label_Comment'), 
    'Comment')

WebUI.setText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Testing appoinment')

WebUI.click(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/p_messageBelowAppConfirm'), 
    'Please be informed that your appointment has been booked as following:')

WebUI.closeBrowser()

