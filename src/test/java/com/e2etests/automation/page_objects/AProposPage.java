package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AProposPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='à propos']")
	public static WebElement aProposBtn;
	@FindBy(how = How.CSS, using = "img[src='/buttons/twitch.png']")
	public static WebElement twitchbtn ;
	@FindBy(how = How.CSS, using = "img[src='/buttons/masto.png']")
	public static WebElement mastobtn ;
	@FindBy(how = How.CSS, using = "img[src='/buttons/insta.png']")
	public static WebElement instabtn ;
	
	public AProposPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	/* Create Method */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void clickOnAleatoirBtn() {
		aProposBtn.click();
	}
	
}
