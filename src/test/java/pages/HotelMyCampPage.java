package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Log in']")
    public static WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public static WebElement userName;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public static WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[text()='Add Room Reservation']")
    public WebElement addRoom;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;

}