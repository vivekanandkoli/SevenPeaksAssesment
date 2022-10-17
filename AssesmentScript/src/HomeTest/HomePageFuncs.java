package HomeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageFuncs extends HomePageObjects {

//	private WebDriver driver;

	public HomePageFuncs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void InputDataInSearchBoxNClickSearchIcon(String itemName) {
		try {

			getSearchBox().sendKeys(itemName);

			getSearchButton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String verifySearchedItem() {
		String itemName = null;
		try {

			itemName = getFirstGridItem().getText();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return itemName;
	}

	public void mousoverWomenOption() {
		try {
			Thread.sleep(2000);
			
			Actions a = new Actions(driver);
			a.moveToElement(getWomenOption()).build().perform();

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clicTshirtsOption() {
		try {

			getTshirtsOption().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void closeDriver() {
		try {

			driver.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
