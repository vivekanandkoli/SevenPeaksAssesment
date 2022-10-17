package HomeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {

	@Test(priority = 1)
	public void searchValidation() throws Exception {

		homePageFuncs.mousoverWomenOption();
		homePageFuncs.clicTshirtsOption();

		String firstGridItemName = homePageFuncs.verifySearchedItem();

		homePageFuncs.InputDataInSearchBoxNClickSearchIcon(firstGridItemName);

		String itemName = homePageFuncs.verifySearchedItem();

		Assert.assertEquals(firstGridItemName, itemName);

	}

}
