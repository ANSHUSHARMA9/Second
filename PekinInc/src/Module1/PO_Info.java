package Module1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_Info {
	
	public @FindBy(xpath="//input[@id='fname']") WebElement info_fname;
	public @FindBy(xpath="//input[@name='email' and @name='email']") WebElement info_eamil;
	public @FindBy(xpath="//input[@type='password' and @name='password']") WebElement info_password;
	public @FindBy(xpath="//input[@type='text' and @id='fname']") WebElement info_mob;
	public @FindBy(xpath="//*[@id='basicDetailForm']//resman-location//div//div//div[1]//div//div[1]//ul//li//div//label") WebElement info_curntloc;
	public @FindBy(xpath="//input[@type='file' and @multiple='multiple']") WebElement info_upldresum;
	

}
