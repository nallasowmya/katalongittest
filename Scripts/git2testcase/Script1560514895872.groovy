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

WebUI.navigateToUrl('https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com')

WebUI.setText(findTestObject('Object Repository/git2testcase/Page_Jobseekers Login Search the Best Jobs available in India  Abroad - Naukricom/input_Email ID  Username_usernameField'), 
    'sowmyareddy')

WebUI.setEncryptedText(findTestObject('Object Repository/git2testcase/Page_Jobseekers Login Search the Best Jobs available in India  Abroad - Naukricom/input_Password_passwordField'), 
    'BOryKUSLMyLqmNeHQ/bJGQ==')

WebUI.click(findTestObject('Object Repository/git2testcase/Page_Jobseekers Login Search the Best Jobs available in India  Abroad - Naukricom/button_Login'))

WebUI.closeBrowser()

