package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	// timeout
	public static void timeout(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	// browsertype
	public static void getdriver(String browserType) {

		switch (browserType) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			break;
		}

	}

	// Logincredentials
	public String getPropertyValue(String key) throws IOException {

		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\Config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object values = properties.get(key);
		String value = (String) values;
		return value;
	}

	// 1
	public static void getUrl(String url) {

		driver.get(url);
	}

	// 2
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 3
	public static void quit() {
		driver.quit();
	}

	// 4
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}

	// 5
	public String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 6
	public WebElement findelementbyid(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}

	// 7
	public WebElement findelementbyname(String attributevalue) {
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}

	// 8
	public WebElement findelementbyxpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath("xpath"));
		return findElement;
	}

	// 9
	public WebElement findelementbyclassname(String attributevalue) {
		WebElement findElement = driver.findElement(By.className(attributevalue));
		return findElement;
	}
	// 10

	public void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void sendkeysEnter(WebElement element, String value) {
		element.sendKeys(value, Keys.ENTER);
	}

	// 11
	public void click(WebElement element) {
		element.click();
	}

	// 12
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 13
	public String getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 14
	public String getattribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	// 15
	public void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 16
	public void navigate(String url) {
		driver.navigate().to(url);
	}

	// 17
	public void navigate() {
		driver.navigate().back();
	}

	// 18
	public void navigate2() {
		driver.navigate().forward();
	}

	// 19
	public void navigate3() {
		driver.navigate().refresh();
	}

	// 20
	public void movetoelement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	// 21
	public void draganddrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();

	}

	// 22
	public void contextclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	// 23
	public void keypress(int value) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(value);
	}

	// 24
	public void keyrelease(int value) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(value);
	}

	// 25
	public void keyup(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyUp(key).click().perform();

	}

	// 26
	public void keydown(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key).perform();
	}

	// 27
	public void keyup(CharSequence key, WebElement target) {
		Actions actions = new Actions(driver);
		actions.keyUp(key).perform();

	}

	// 28
	public void keydown(CharSequence key, WebElement target) {
		Actions actions = new Actions(driver);
		actions.keyDown(target, key).perform();
	}

	// 29
	public String gettext() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		return text;
	}

	// 30
	public Alert switchtoalert(String keys) {
		Alert a = switchtoalert(keys);
		a.sendKeys(keys);
		return a;
	}

	// 31
	public Alert switchtoalert() {
		Alert al = driver.switchTo().alert();
		return al;
	}

	// 32
	public Alert accept() {
		Alert al = driver.switchTo().alert();
		al.accept();
		return al;
	}

	// 33
	public Alert dismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		return al;
	}

	// 34
	public void typejs(String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].set attribute'value','" + data + "')", element);
	}

	// 35
	public Object clickjs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].click()", element);
		return executeScript;

	}

	// 36
	public void selectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 37
	public void selectbyvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 38
	public void selectbyvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 39
	public void deselectall(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 40
	public List<WebElement> getoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 41
	public void deselectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

	// 42
	public void deselectbyvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 43
	public void deselectbyvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 44
	public List<WebElement> getallselectedoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 45
	public WebElement getfirstselectedoption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 46
	public boolean ismultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 47
	public void clear(WebElement element) {
		element.clear();
	}

	// 48
	public void submit(WebElement element) {
		element.submit();
	}

	// 49
	public org.openqa.selenium.Dimension getsize(WebElement element) {
		org.openqa.selenium.Dimension size = element.getSize();
		return size;
	}

	// 50
	public String gettagname(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	// 51
	public void screenshot(String pathname, File srcFile, File destFile) throws IOException {
	//	TakesScreenshot screenshot = (TakesScreenshot) driver;
	//	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		//File des = new File(pathname);
		FileUtils.copyFile(srcFile, destFile);
	}

	// 52
	public void framebyid(String id) {
		driver.switchTo().frame(id);
	}

	// 53
	public void framebyindex(int index) {
		driver.switchTo().frame(index);
	}

	// 54
	public void framebywebelement(String frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// 55
	public void parentframe() {
		driver.switchTo().parentFrame();
	}

	// 56
	public void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	// 57
	public String getwindowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// 58
	public Set<String> getwindowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// 59
	//public static void implicitwait(long seconds) {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//}

	// 60
	public void close() {
		driver.close();
	}

	// 61
	public Object scrolldown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].scrollIntoView(true)", element);
		return executeScript;
	}

	// 62
	public Object scrollup(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].scrollIntoView(false)", element);
		return executeScript;
	}

	// 63
	public String getdata(String sheetname, int rowno, int cellno) throws IOException {
		String res = null;
		File file = new File(
				"C:\\Users\\Devaraj.V\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse\\SampleMaven\\Excel\\Excel sheets.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInput);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType Type = cell.getCellType();

		switch (Type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy");
				res = format.format(dateCellValue);

			} else {
				double value2 = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(value2);
				res = decimal.toString();
			}

		default:
			break;
		}
		return res;
	}

	// 64
	public void getdata(String sheetname, int rowno, int cellno, String olddata, String Newdata) throws IOException {
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\SampleMaven\\Excel\\Excel sheets.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInput);
		Sheet sheet = book.createSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType Type = cell.getCellType();
		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(Newdata);
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		book.write(outputStream);
	}

	// 65
	public void writedata(String sheetname, int rowno, int cellno, String data) throws IOException {
		File file = new File(
				"C:\\Users\\Devaraj.V\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse\\SampleMaven\\Excel\\Excel sheets.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInput);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(file);
		book.write(outputStream);
	}

}