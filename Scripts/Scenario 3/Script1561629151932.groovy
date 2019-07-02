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

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Username_username'), username)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Password_password'), password)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/button_Login'))

WebUI.takeScreenshot()

String message = 'Login failed! Please ensure the username and password are valid.'

if (WebUI.verifyTextPresent(message, true, FailureHandling.OPTIONAL)) {
    System.out.println('Login Failed')
} else {
    WebUI.delay(3)

    WebUI.selectOptionByValue(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/select_Facility'), 
        'Hongkong CURA Healthcare Center', true)

    WebUI.verifyTextPresent('Apply for hospital readmission', true)

    WebUI.check(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/ReadmissionChckbox'))

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Medicare_programs'))

    WebUI.setText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
        '29/07/2019')

    WebUI.setText(findTestObject('Login Failed/Page_CURA Healthcare Service/Page_CURA Healthcare Service/textarea_Comment_comment'), 
        'Appoinment on 29/7')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.delay(2)

    WebUI.verifyTextPresent('Hongkong CURA Healthcare Center', true)

    WebUI.delay(2)

    WebUI.verifyTextPresent('No', false)

    WebUI.delay(2)

    WebUI.verifyTextPresent('Medicare', true)

    WebUI.delay(2)

    WebUI.verifyTextPresent('29/07/2019', true)

    WebUI.delay(2)

    WebUI.verifyTextPresent('Appoinment on 29/7', true)
}

WebUI.closeBrowser()

