package stepDefinitions.UI_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.commonPage;
import static stepDefinitions.Hooks.driver;

public class US_001_StepDef {


    @Given("user goes to the homepage")
    public void userGoesToTheHomepage() {


    }

    @When("user clicks SignIn")
    public void user_clicks_sign_in() {
        commonPage.getinovTeamPage().signINMyshop.click();
        ReusableMethods.waitFor(1);

    }

    @Then("valid email address is entered")
    public void valid_email_address_is_entered() {
        commonPage.getinovTeamPage().emailMyshop.sendKeys(ConfigurationReader.getProperty("validEmailMyShop"));
        ReusableMethods.waitFor(2);

    }

    @Then("valid password is entered")
    public void valid_password_is_entered() {
        commonPage.getinovTeamPage().passwordMyshop.sendKeys(ConfigurationReader.getProperty("currentPasswordMyShop"));
        ReusableMethods.waitFor(2);

    }

    @Then("click the SignIn button")
    public void click_the_sign_in_button() {
        JS_utilities.scrollIntoViewJS(commonPage.getinovTeamPage().signIN2Myshop);
        ReusableMethods.waitFor(1);
        commonPage.getinovTeamPage().signIN2Myshop.click();
        ReusableMethods.waitFor(1);
        String currentUrl = driver.getCurrentUrl();
        ReusableMethods.waitFor(1);
        String expectedUrl = "http://www.automationpractice.pl/index.php?controller=my-account";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedUrl,currentUrl);


    }

    @Then("user clicks on the My Personal Information button")
    public void user_clicks_on_the_my_personal_information_button() {
        commonPage.getinovTeamPage().myPersonalInformation.click();
        ReusableMethods.waitFor(1);

    }

    @Then("user enters old password")
    public void user_enters_old_password() {
        commonPage.getinovTeamPage().currentPassword.sendKeys(ConfigurationReader.getProperty("currentPasswordMyShop"));
        ReusableMethods.waitFor(1);
    }

    @Then("user enters new password")
    public void user_enters_new_password() {
        commonPage.getinovTeamPage().newPassword.sendKeys(ConfigurationReader.getProperty("newPasswordMyShop"));
        ReusableMethods.waitFor(1);
    }

    @Then("user confirms old passport")
    public void user_confirms_old_passport() {
        commonPage.getinovTeamPage().confirmationPassword.sendKeys(ConfigurationReader.getProperty("newPasswordMyShop"));
        ReusableMethods.waitFor(1);
    }

    @Then("click on save button")
    public void click_on_save_button() {
        commonPage.getinovTeamPage().saveButton.click();

    }

    @Then("The text Your personal information has been successfully updated should appear")
    public void the_text_your_personal_information_has_been_successfully_updated_should_appear() {
        Assert.assertTrue(commonPage.getinovTeamPage().succesfulyText.isDisplayed());
        ReusableMethods.waitFor(2);

    }

////////TC002 INOV TEAM

    @Given("acceder la page Dashboard")
    public void acceder_la_page_dashboard() {


    }

    @When("cliquer sur le bouton Rejoindre la Team")
    public void cliquer_sur_le_bouton_rejoindre_la_team() {
        commonPage.getinovTeamPage().buttonRejoindreTeam.click();
        ReusableMethods.waitFor(2);

    }

    @Then("selectionner Longlet Testeur fonctionnel et automatise")
    public void selectionner_longlet_testeur_fonctionnel_et_automatise() {
        JS_utilities.scrollIntoViewJS(commonPage.getinovTeamPage().testeur);
        ReusableMethods.waitFor(3);
        JS_utilities.clickElementByJS(commonPage.getinovTeamPage().testeur2);

        //    JS_utilities.clickElementByJS(commonPage.getinovTeamPage().testeur);
        ReusableMethods.waitFor(1);



    }

    @Then("cliquer sur le bouton postuler")
    public void cliquer_sur_le_bouton_postuler() {
        JS_utilities.scrollIntoViewJS(commonPage.getinovTeamPage().postuler);
        ReusableMethods.waitFor(3);
        commonPage.getinovTeamPage().postuler.click();


    }

    @Then("saisir les informations necassaire")
    public void saisir_les_informations_necassaire() {
        commonPage.getinovTeamPage().namepostuler.sendKeys("FATIH");
        ReusableMethods.waitFor(1);
        commonPage.getinovTeamPage().lastnamepostuler.sendKeys("YILMAZ");
        ReusableMethods.waitFor(1);
        commonPage.getinovTeamPage().emailpostuler.sendKeys("fatih@yopmail.com");
        ReusableMethods.waitFor(1);
    }

    @Then("cliquer le bouton Envoyer")
    public void cliquer_le_bouton_envoyer() {
        JS_utilities.scrollIntoViewJS(commonPage.getinovTeamPage().envoyer);
        Assert.assertTrue(commonPage.getinovTeamPage().envoyer.isEnabled());
        ReusableMethods.waitFor(1);
    }




}
