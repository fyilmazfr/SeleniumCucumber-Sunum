package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class inovTeamPage extends CommonPage{

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signINMyshop;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailMyshop;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordMyshop; //input[@id='passwd']

    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signIN2Myshop;

    @FindBy(xpath = "//span[text()='My personal information']")
    public WebElement myPersonalInformation;

    @FindBy(xpath = "//input[@id='old_passwd']")
    public WebElement currentPassword;

    @FindBy(xpath = "(//input[@class='is_required validate form-control'])[5]")
    public WebElement newPassword;
    @FindBy(xpath = "//input[@id='confirmation']")
    public WebElement confirmationPassword;

    @FindBy(xpath = "//button[@name='submitIdentity']")
    public WebElement saveButton;

    @FindBy(xpath = "//body[@class='identity hide-left-column hide-right-column lang_en']")
    public WebElement succesfulyText;

    /////////////////// INOV TEAM STEP DEF
    @FindBy(xpath = "//a[@class='btn btn-light']")
    public WebElement buttonRejoindreTeam;

    @FindBy(xpath = "(//a[@class='read-more-btn'])[8]")
    public WebElement testeur;
    @FindBy(xpath = "//img[@alt='Recrutement Testeur fonctionnel']")
    public WebElement testeur2;

    @FindBy(xpath = "//a[@class='postulate-button btn btn-primary']")
    public WebElement postuler;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement namepostuler;
    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastnamepostuler;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailpostuler;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement envoyer;





}

