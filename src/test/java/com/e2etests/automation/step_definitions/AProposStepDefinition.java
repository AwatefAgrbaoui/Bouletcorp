package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AProposPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AProposStepDefinition {
	private AProposPage aProposPage;

	public AProposStepDefinition() {
		this.aProposPage = new AProposPage();
	}

	@Given("Je me connecte a l application Bouletcorp")
	public void jeMeConnecteALApplicationBouletcorp() {
		aProposPage.goToUrl();
	}
	
	@When("Je clique sur le bouton a propos")
	public void jeCliqueSurLeBoutonAPropos() {
		aProposPage.clickOnAleatoirBtn();
	}

	@Then("Je me redirige vers la page a propos {string} {string} {string} s affiche")
	public void jeMeRedirigeVersLaPageAProposSAffiche(String twitchLink, String mastroLink, String instraLink) {
		 String twitter = AProposPage.twitchbtn.getAttribute("src");
		  Assert.assertEquals(twitchLink, twitter);
		  String mastro = AProposPage.mastobtn.getAttribute("src");
		  Assert.assertEquals(mastroLink, mastro);
		  String insta = AProposPage.instabtn.getAttribute("src");
		  Assert.assertEquals(instraLink, insta); 
	}
}
