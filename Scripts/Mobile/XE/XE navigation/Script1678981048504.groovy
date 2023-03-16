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

Mobile.startApplication('my.com.time.selfcare.app', false)

Mobile.takeScreenshot('/var/folders/pj/tdgwyxh90y759nk534c9prjc0000gn/T/screenshot1207179837856191908.png')

Mobile.getText(findTestObject('Object Repository/XE/android.widget.TextView - 500Mbps Plan'), 0)

Mobile.tap(findTestObject('Object Repository/XE/android.widget.Button - PAY BILL'), 0)

Mobile.tap(findTestObject('Object Repository/XE/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/XE/android.widget.TextView - Bills'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/XE/android.widget.ImageView (1)'), 0)

Mobile.takeScreenshot('/var/folders/pj/tdgwyxh90y759nk534c9prjc0000gn/T/screenshot1514044602369760307.png')

Mobile.tap(findTestObject('Object Repository/XE/android.widget.TextView - PAY NOW'), 0)

Mobile.takeScreenshot('/var/folders/pj/tdgwyxh90y759nk534c9prjc0000gn/T/screenshot3709767762133904911.png')

Mobile.closeApplication()

