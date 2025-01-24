package org.base;

import java.awt.AWTException;
import java.util.*;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	
	public static WebDriver driver;

	// 1 Browser Launch
	public static WebDriver Browserlaunch(String brname) {
		
		if(brname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
        return driver =new ChromeDriver();
		}
		else if(brname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
	         driver =new EdgeDriver();
		}
		return driver;	
	}
	
	
	// 2 Url Launch
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

    //3 ImplicitWait
	}
	public static void ImplicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
	
	//4 Sendkeys
	public static void sendkeys(WebElement e,String user) {
		
            e.sendKeys(user);
			
			
	}
	
	//5 Click
	public static void click(WebElement webElement)throws NullPointerException {
		webElement.click();
	}
	
	//6 Gettext
	public static  String gettext(WebElement e) {
		String text = e.getText();
         System.out.println(text);
         return text;
	}
	
	// 7 Getattribute
	public static void getattribute(WebElement e) {
		String attribute = e.getAttribute("value");
         System.out.println(attribute);
	}
	
	//8 quit
	public static void Quit() {
		driver.quit();

	}
	
	//Action Class Methods

    // 9 Method to perform a double click 
    public static void doubleClickElement(WebElement element) {
    	Actions a=new Actions(driver);
        a.doubleClick(element).build().perform();
    }

    // 10 Method to perform a right click 
    public static void rightClickElement(WebElement element) {
    	Actions a=new Actions(driver);
        a.contextClick(element).build().perform();
    }
    
    // 11 movetoElement 
    public void moveToElement(WebElement element) {
    	Actions a=new Actions(driver);
        a.moveToElement(element).perform();
    }

    // 12 Method to perform a drag and drop operation
    public static void dragAndDrop(WebElement source, WebElement target) {
    	Actions a=new Actions(driver);
        a.dragAndDrop(source, target).build().perform();
    }
	
    //Alert Methods
    
 // 13 Method to get the text of the alert and accept it
    public static String handleAlertAndGetText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }
 // 14 Method to accept the alert
     public static void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // 15 Method to dismiss the alert
    public static void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    
    //Robot methods
    
 // 16 Method to simulate pressing Enter key
    public static void pressEnterKey(WebElement webElement) throws AWTException, InterruptedException {
    	Robot a=new Robot();
    	a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_ENTER);
        a.keyRelease(KeyEvent.VK_ENTER);
        a.keyRelease(KeyEvent.VK_CONTROL);        
        Thread.sleep(500);

    }

    // 17 Method to select all text
    public static void selectall(WebElement webElement) throws AWTException, InterruptedException {
    	Robot a=new Robot();
    	a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_A);
        a.keyRelease(KeyEvent.VK_A);
        a.keyRelease(KeyEvent.VK_CONTROL);        
        Thread.sleep(500);

    }
    
 // 18 Method to Copy the text
    public static void copy(WebElement webElement) throws AWTException, InterruptedException {
    	Robot a=new Robot();
    	a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_C);
        a.keyRelease(KeyEvent.VK_C);
        a.keyRelease(KeyEvent.VK_CONTROL);        
        Thread.sleep(500);
        
    }
    
 // 19 Method to cut the select text
    public static void cut(WebElement webElement) throws AWTException {
    	Robot a=new Robot();
    	a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_X);
        a.keyRelease(KeyEvent.VK_X);
        a.keyRelease(KeyEvent.VK_CONTROL);
    }
 // 20 Method to Paste all the copied text
    public static void paste(WebElement webElement) throws AWTException {
    	Robot a=new Robot();
    	a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_V);
        a.keyRelease(KeyEvent.VK_V);
        a.keyRelease(KeyEvent.VK_CONTROL);
    }
    
// Select methods
    
 // 21 Method to select an option by visibletext 
    public static void selectOptionByText(By dropdownLocator, String visibleText) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    //22  Method to select an option by index from a dropdown
    public static void selectOptionByIndex(By location, int index) {
        WebElement dropdownElement = driver.findElement(location);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    // 23 Method to select an option by value from a dropdown
    public static void selectOptionByValue(By dropdownLocator, String value) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }

 // 24 Method to select all options 
    public static void selectAll(By Locator) {
        WebElement dropdownElement = driver.findElement(Locator);
        Select dropdown = new Select(dropdownElement);

        if (dropdown.isMultiple()) {
            for (WebElement option : dropdown.getOptions()) {
                dropdown.selectByVisibleText(option.getText());
            }
        } else {
            System.out.println("The dropdown is not a multi-select");
        }
    }

    // 25 Method to deselect all options 
    public static void deselectAllOptions(By dropdownLocator) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);

        if (dropdown.isMultiple()) {
            dropdown.deselectAll();
        } else {
        	System.out.println("The dropdown is not a multi-select");        }
    }
  // 26 Select an option from a dropdown by visible text.
    
    public void selectByVisibleText(WebElement dropdownElement, String visibleText) {
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
    }

    
     //27 Select an option from a dropdown by index.
    
    public void selectByIndex(WebElement dropdownElement, int index) {
        Select select = new Select(dropdownElement);
        select.selectByIndex(index);
    }
    
    
	//Window handling
    
 // 28 Method to close the current window
    public static void closeCurrentWindow() {
        driver.close();
    }

    // 29 Method to get all window handles
    public static  void getAllWindow() {
        Set<String> allid= driver.getWindowHandles();
		System.out.println(allid);
    }
	
    //30 Method to get current window id
    
    public static String currentwinid() {
         String currentwinid = driver.getWindowHandle();
         System.out.println(currentwinid);
		return currentwinid;
    }
	
    // 31 Method to switch to a window by index
    public static  void swithWindowByIndex(int windowIndex) {
        Set<String> windowHandles = driver.getWindowHandles();
        
        if (windowIndex >= 0 && windowIndex < windowHandles.size()) {
            // Convert set to array and switch to the window by index
            String[] handles = windowHandles.toArray(new String[0]);
            driver.switchTo().window(handles[windowIndex]);
        } else {
            System.err.println("Invalid window index");
        }
    }
        //32 Method to switch to a new window based on its title
        public static void titileswitch(String string) {
        String currentWindow = driver.getWindowHandle();  
        for(String winHandle : driver.getWindowHandles()){
        	   if (driver.switchTo().window(winHandle).getTitle().equals(currentWindow)) {
        	     
        	     break;
        	   } 
        	   else {
        	      driver.switchTo().window(currentWindow);
        	   } 
        	}
	
}
        
 //Frames method
     // 33 Switch to a frame using index
        
        public static void switchToFrameByIndex(int index) {
            driver.switchTo().frame(index);
        }

     // 34 Switch to a frame using its name or id attribute.
        public static void switchToFrameByNameOrId(String frameNameOrId) {
            driver.switchTo().frame(frameNameOrId);
        }
      
     //  35 Switch back to the default content from any nested frames.
     
        public static void switchToDefaultContent() {
            driver.switchTo().defaultContent();
        }
        
        
    //Javascript/executor
        
     // 36 Method to click on an element using JavaScript
        public static void clickElementWithJavaScript(WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", element);
        }

        // 37 Method to scrolldown into view of an element using JavaScript
        public static void scrollToElement(WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
           
        }
     // 38 Method to scrolldown into view of an element using JavaScript
        public static void scrollToElementup(WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(false);", element);
           
        }
        
     // 39 Method to get attribute value using JavaScriptExecutor
        public static String getAttributeUsingJS(WebElement element, String attributeName) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            return (String) jsExecutor.executeScript("return arguments[0].getAttribute(arguments[1]);", element, attributeName);
        }

        // 40 Method to set attribute value using JavaScriptExecutor
        public static  void setAttributeUsingJS(WebElement element, String attributeName, String attributeValue) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
        }
      
        
        // 41 Method to take a screenshot and return the File object
        public static  void ScreenshotAsFile(String name) throws IOException {
            TakesScreenshot ssd = (TakesScreenshot) driver;
            File src = ssd.getScreenshotAs(OutputType.FILE);
            File des=new File(System.getProperty("user.dir"+"/Newdayd/src/test/resources/A"+name+".png"));
            FileUtils.copyFile(src, des);
			
        	
			
        }
        public static  String exceldata(String name, String sheetname, int row, int ce) throws IOException {
        	File f=new File("C:\\Users\\Best\\eclipse-workspace\\junittsprogram\\src\\test\\resources\\"+name+".xlsx");
	
        	FileInputStream f1=new FileInputStream(f);
        	
        	Workbook m=new XSSFWorkbook(f1);
        	Sheet s=m.getSheet(sheetname);
            Row r=s.getRow(row);
           
            Cell cell =r.getCell(ce);    
            int type = cell.getCellType();
            String value=null;
            if(type==1) {
            	value=cell.getStringCellValue();
            }
            else {
            	if(DateUtil.isCellDateFormatted(cell)){
            		Date d=cell.getDateCellValue();
            		SimpleDateFormat si=new SimpleDateFormat("dd-mm-yyyy");
                	value =si.format(d);
            	}
            	else {
            		double d=cell.getNumericCellValue();
            		long l=(long)d;
            		value =String.valueOf(l);            		
            	}
            	
            }
          return value;
        
        }
        
        public static void setCellValue(String sheetName, int rowNum, int cellNum, String value, String name)
                throws IOException, InvalidFormatException {
            File file = new File("C:\\Users\\Best\\eclipse-workspace\\junittsprogram\\src\\test\\resources\\" + name + ".xlsx");

            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);
            if (row == null) {
                row = sheet.createRow(rowNum);
            }

            Cell cell = row.createCell(cellNum);
            cell.setCellValue(value);

            fileInputStream.close();

            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
           
            outputStream.close();
        }
 
            		



     
        }
