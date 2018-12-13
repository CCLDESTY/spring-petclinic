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

WebUI.navigateToUrl('http://localhost:8080/owners/find')

WebUI.click(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/a_Add Owner'))

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_First Name_firstName'), 'Patrick')

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_Last Name_lastName'), 'Keller')

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_Address_address'), 'Home')

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_City_city'), 'Luxemburg')

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_Telephone_telephone'), '123456789')

WebUI.click(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/button_Add Owner'))

WebUI.navigateToUrl('http://localhost:8080/owners/find')

WebUI.setText(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/input_Last name_lastName (1)'), 'Keller')

WebUI.click(findTestObject('Object Repository/Page_PetClinic  a Spring Framework/button_Find          Owner'))

WebUI.verifyElementPresent(findTestObject('Page_PetClinic  a Spring Framework/td_Patrick Keller'), 0)

WebUI.closeBrowser()

