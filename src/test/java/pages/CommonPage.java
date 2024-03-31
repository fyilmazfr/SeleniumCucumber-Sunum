package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {
    /*
burasi ana cati page
page factory 'i bir kez olusturmus oluyoruz ve her page in icinde tekrar tekrar olusturmaya gerek kalmiyor
burasi parent class oluyor bu sayede
page factory driver'in web sayfasinda aradigimiz web elementini bulmamizi saglar
ve Common page normal bir java class'i degil Abstract class yapacagiz
 */
    public CommonPage() {// PageFactory constructir'i olusturuyoruz
        PageFactory.initElements(driver,this);

    }

    //diger page'ler bu sayfayi kullanabilmesi icin private  objeler olustururuz
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private Pages_fy pages_fy;
    public inovTeamPage inovTeamPage;

    //simdi tedbir amacli bir method olusturup page sayfasinin bos donmemesini saglicaz
    //ve sted def 'te objelerimizi bu method sayesinde cagiracagiz
    //her yeni page sayfasi ekledigimizde buraya bir get methodu eklememiz gerekiyor

    public inovTeamPage getinovTeamPage() {
        if (inovTeamPage == null) {
            inovTeamPage = new inovTeamPage();
        }
        return inovTeamPage;
    }
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public Pages_fy getPages_fy() {
        if (pages_fy == null) {
            pages_fy = new Pages_fy();
        }
        return pages_fy;
    }

}
