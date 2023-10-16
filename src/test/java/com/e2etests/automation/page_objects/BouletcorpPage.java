package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {
	private ConfigFileReader configFileReader;
	
	final static String button_Apropos = "//a[normalize-space()='à propos']" ;
	final static String twitch_Widget = "img[src='/buttons/twitch.png']" ;
	final static String masto_Widget = "img[src='/buttons/masto.png']" ;
	final static String insta_Widget = "img[src='/buttons/insta.png']" ;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = button_Apropos)
	public static WebElement aProposBtn;
	@FindBy(how = How.CSS, using = twitch_Widget)
	public static WebElement twitchWidget ;
	@FindBy(how = How.CSS, using = masto_Widget)
	public static WebElement mastoWidget ;
	@FindBy(how = How.CSS, using = insta_Widget)
	public static WebElement instaWidget ;
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	/* Create Method */
	
	public void clickOnBtn() {
		aProposBtn.click();
	}
	public void checkUrlChanged() {
		String actualUrl = Setup.getDriver().getCurrentUrl();
		System.out.println("Title of the page: "+actualUrl);
		String url = configFileReader.getProperties("bouletcorp.url");
		if (actualUrl.equals(url)) {
			System.out.println(" Failed: the url is not changed");		
		}
		else {
			System.out.println(" Succed: the url is changed");		

		}	
	}
}
