package HomeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects extends BaseClass {

	public HomePageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenOption;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement tshirtsOption;

	@FindBy(xpath = "(//ul[@class='product_list grid row']//div[@class='product-container'])[1]//a[@class='product-name']")
	private WebElement firstGridItem;

	@FindBy(id = "search_query_top")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement searchButton;

	public WebElement getWomenOption() {
		return womenOption;
	}

	public WebElement getTshirtsOption() {
		return tshirtsOption;
	}

	public WebElement getFirstGridItem() {
		return firstGridItem;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
