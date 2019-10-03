package Module1;

import java.awt.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.jboss.netty.channel.socket.Worker;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.collections.Lists;

  public class Methods{
	  
  
	  public WebDriver driver;
	  public Workbook wb;
	  public FileInputStream f;
	  public Sheet s;
  
		
	//***********************************************************************************
	//Method name   :  Launchapp
	//Description   :  To launch application
	//Authors       :  Anshu
	//Date created  :  30/09/2019
	//Parameter     :  String url, String sspath
	//Reviewed by   :  Anshu
	
//**************************************************************************************
	

	public void launchApp(String url ,String sspath )throws Exception{
	  driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\anshusharma9\\Desktop\\Framework\\Test Result"));
		
	}
	
//*********************************************************************************
	     //Method name  : Closeapp
		//Description   :  To Close application
		//Authors       :  Anshu
		//Date created  :  30/09/2019
		//Parameter     :  String url, String sspath
		//Reviewed by   :  Anshu
//**************************************************************************************
		public void closeApp(){
			driver.close();
		}
//***************************************************************************************************
		        //Method name  :   Closeapp
				//Description   :  To Close application
				//Authors       :  Anshu
				//Date created  :  30/09/2019
				//Parameter     :  String url, String sspath
				//Reviewed by   :  Anshu
//*********************************************************************************************************************
		public void elementPresent(WebElement element,boolean exp,String sspath)throws Exception{
			boolean a=element.isDisplayed();
			if (a==exp){
			
				System.out.println("Pass");
				
				File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f,new File(sspath) );
			
			}
				else
				{
					System.out.println("fail");
				File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f,new File(sspath) );
				
			
				}}
//**********************************************************************************************************************
         public void excel_con(String path,String sname)throws Exception{
        	FileInputStream f=new FileInputStream(path);
        	 wb=Workbook.getWorkbook(f);
        	 s=wb.getSheet(sname);
         
         }
 //****************************************************************************************************************
  
  public void elementenabled(WebElement element,boolean exp,String sspath)throws Exception{
	  boolean a=element.isEnabled();
	  if (a==exp){
			
			System.out.println("Pass");
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f,new File(sspath) );
		
		}
			else
			{
				System.out.println("fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f,new File(sspath) );
			
			}}
 //************************************************************************************************************
  public void ElementCount(String loc,int exp){
	java.util.List<WebElement> Element_Count=driver.findElements(By.tagName(loc));  
	
	if (Element_Count.size()==exp)
		  System.out.println("pass");
	  else
		  System.out.println("fail");
  }} 
	  
	
//*******************************end of method************************************************************

