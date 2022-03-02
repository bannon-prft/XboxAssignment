package xboxtestcases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import xboxbasepages.XboxLeaderboardPage;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxUserGamesTest extends TestCaseBase {
	
	@Test
	public void testTopGames() throws Exception
	{
	Properties PROPERTIES_RESOURCES = SystemUtil
	.loadPropertiesResources("/testdata_XboxUserGamesTest.properties");
	String userTag = PROPERTIES_RESOURCES.getProperty("input.search.user");

	XboxLeaderboardPage xboxLeaderboardPage = new XboxLeaderboardPage();
	xboxLeaderboardPage.open();
	xboxLeaderboardPage.searchUser(userTag);
	Assert.assertTrue(xboxLeaderboardPage.checkGames());


	}
	

}
