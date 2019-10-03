package Module1;

import org.openqa.selenium.support.PageFactory;

public class TestScript {
	
	
	public Methods m;
	
	
	
//**************************************************************************
	
	//Test Name      :    Naukri regpage
	//Author         :    Anshu
	//Date created   :    10032019
	//module name    :    admin module
	//project name   :    Free CM
	
//***************************************************************
	
      public void naukri_regpage() throws Exception{
		
		//creating object for methods class
		m=new Methods();
		
		//importing Excelcon method
		m.excel_con("C:\\Users\\anshusharma9\\Desktop\\test", "sheet1");
		
		//Launhing Naukri application
		
	m.launchApp(m.s.getCell(0, 0).getContents(),"C:\\Users\\anshusharma9\\Desktop\\Framework\\Test Result\\lauchapp.png");
		
		
	//creating pagefactory object
	Po_reg regpage=PageFactory.initElements(m.driver, Po_reg.class);
	
	//verifying reg_fresher and reg_exp
	m.elementPresent(regpage.reg_fresher, true, "C:\\Users\\anshusharma9\\Desktop\\Framework\\Test Result\\regfresher.png");
	
	m.elementPresent(regpage.reg_exp, true, "C:\\Users\\anshusharma9\\Desktop\\Framework\\Test Result\\exp.png");
	
	
    //entering information eamil and other details
	
	//closing appliaction
	m.closeApp();
	//********************************************************************************
	
  
	
	
	
		
	}
	

 
	}


