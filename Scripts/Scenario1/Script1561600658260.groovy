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


String realTittle = "CURA Healthcare Service"
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.takeScreenshot()

String pageTittle = WebUI.getWindowTitle()

if(pageTittle.equalsIgnoreCase(realTittle))
{


WebUI.setText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Username_username'), username)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/input_Password_password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login Failed/Page_CURA Healthcare Service/button_Login'))

}


WebUI.takeScreenshot()

WebUI.closeBrowser()

