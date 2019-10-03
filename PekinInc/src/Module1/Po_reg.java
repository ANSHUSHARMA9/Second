package Module1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Po_reg {

	   public @FindBy(xpath="//button[@title='I am a Fresher']") WebElement reg_fresher;
		public @FindBy(xpath="//button[@title='I am a Professional' and @value='exp']") WebElement reg_exp;
		

	}


