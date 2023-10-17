package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnée;
import io.cucumber.java.fr.Quand;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;
	private ConfigFileReader configFileReader;
	private SeleniumUtils utils;
	private Validations validation;

	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		validation = new Validations();
	}

	@Etantdonnée("Je me rends sur le site Bouletcops {string}")
	public void jeMeRendsSurLeSiteBouletcops(String url) {
		//Setup.getDriver().get(configFileReader.getProperties(url));
		utils.get(configFileReader.getProperties(url));
	}

	@Quand("Je clique sur l onglet Apropos")
	public void jeCliqueSurLOngletApropos() {
		//bouletcorpPage.clickOnBtn();
		utils.click(BouletcorpPage.aProposBtn);
	}

	@Alors("La page est changée")
	public void laPageEstChangée() {
		//bouletcorpPage.checkUrlChanged();
		validation.assertNotEquals(utils.getCurrentUrl(), configFileReader.getProperties("bouletcorp.url"));
	}

	@Alors("Les widgets twitch masto et insta sont bien affichés")
	public void lesWidgetsTwitchMastoEtInstaSontBienAffichés() {
//		boolean twitch = BouletcorpPage.twitchWidget.isDisplayed();
//		Assert.assertTrue(twitch);
//		boolean masto = BouletcorpPage.mastoWidget.isDisplayed();
//		Assert.assertTrue(masto);
//		boolean insta = BouletcorpPage.instaWidget.isDisplayed();
//		Assert.assertTrue(insta);
		
		boolean twitch = validation.isElementDisplayed(BouletcorpPage.twitchWidget);
		validation.assertTrue(twitch);
		boolean masto = validation.isElementDisplayed(BouletcorpPage.mastoWidget);
		validation.assertTrue(masto);
		boolean insta = validation.isElementDisplayed(BouletcorpPage.instaWidget);
		validation.assertTrue(insta);
		
		
	}

}
