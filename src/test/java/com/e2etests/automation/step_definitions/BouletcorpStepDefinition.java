package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnée;
import io.cucumber.java.fr.Quand;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;
	private ConfigFileReader configFileReader;

	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
		configFileReader = new ConfigFileReader();
	}

	@Etantdonnée("Je me rends sur le site Bouletcops {string}")
	public void jeMeRendsSurLeSiteBouletcops(String url) {
		Setup.getDriver().get(configFileReader.getProperties(url));
	}

	@Quand("Je clique sur l onglet Apropos")
	public void jeCliqueSurLOngletApropos() {
		bouletcorpPage.clickOnBtn();
	}

	@Alors("La page est changée")
	public void laPageEstChangée() {
		bouletcorpPage.checkUrlChanged();
	}

	@Alors("Les widgets twitch masto et insta sont bien affichés")
	public void lesWidgetsTwitchMastoEtInstaSontBienAffichés() {
		boolean twitch = BouletcorpPage.twitchWidget.isDisplayed();
		Assert.assertTrue(twitch);
		boolean masto = BouletcorpPage.mastoWidget.isDisplayed();
		Assert.assertTrue(masto);
		boolean insta = BouletcorpPage.instaWidget.isDisplayed();
		Assert.assertTrue(insta);
	}

}
