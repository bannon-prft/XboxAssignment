package xboxbasepages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxLeaderboardPage extends Page{
	
	@FindBy(xpath="(//div[@class=\"row\"]/*/*/div[@class=\"col-lg col-12\"]/a)[1]")
	public WebElement gamertagDisplay1;
	
	@FindBy(xpath="(//div[@class=\"row\"]/*/*/div[@class=\"col-lg col-12\"]/a)[2]")
	public WebElement gamertagDisplay2;
	
	@FindBy(xpath="(//div[@class=\"row\"]/*/*/div[@class=\"col-lg col-12\"]/a)[3]")
	public WebElement gamertagDisplay3;
	
	@FindBy(xpath="(//div[@class=\"row\"]/*/*/div[@class=\"col-lg col-12\"]/a)[4]")
	public WebElement gamertagDisplay4;
	
	@FindBy(xpath="(//div[@class=\"row\"]/*/*/div[@class=\"col-lg col-12\"]/a)[5]")
	public WebElement gamertagDisplay5;
	
	@FindBy(name = "s")
	public WebElement searchInput;
	
	@FindBy(xpath="(//div[@class=\"recent-games\"]//div[@class=\"game-card-desc\"]//a)[1]")
	public WebElement actualGame1;
	
	@FindBy(xpath="(//div[@class=\"recent-games\"]//div[@class=\"game-card-desc\"]//a)[2]")
	public WebElement actualGame2;
	
	@FindBy(xpath="(//div[@class=\"recent-games\"]//div[@class=\"game-card-desc\"]//a)[3]")
	public WebElement actualGame3;
	
	@FindBy(xpath="(//div[@class=\"recent-games\"]//div[@class=\"game-card-desc\"]//a)[4]")
	public WebElement actualGame4;
	
	@FindBy(xpath="(//div[@class=\"recent-games\"]//div[@class=\"game-card-desc\"]//a)[5]")
	public WebElement actualGame5;

	public XboxLeaderboardPage open() throws Exception {
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_XboxTop5Test.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("xbox.url");
		TestCaseBase.threadDriver.get().navigate().to(URL);
		
		return this;
	}
	
	public boolean getGamerTags() {
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_XboxTop5Test.properties");
		
		boolean result = true;
		String user1 = PROPERTIES_RESOURCES.getProperty("gamertag1");
		String user2 = PROPERTIES_RESOURCES.getProperty("gamertag2");
		String user3 = PROPERTIES_RESOURCES.getProperty("gamertag3");
		String user4 = PROPERTIES_RESOURCES.getProperty("gamertag4");
		String user5 = PROPERTIES_RESOURCES.getProperty("gamertag5");

		if (!user1.equals(gamertagDisplay1.getText())) {
		result = false;
		System.out.println("expected: " + user1 + "actual: " + gamertagDisplay1.getText() );
		}
		if (!user2.equals(gamertagDisplay2.getText())) {
		result = false;
		System.out.println("expected: " + user2 + "actual: " + gamertagDisplay2.getText() );
		}
		if (!user3.equals(gamertagDisplay3.getText())) {
		result = false;
		System.out.println("expected: " + user3 + "actual: " + gamertagDisplay3.getText() );
		}
		if (!user4.equals(gamertagDisplay4.getText())) {
		result = false;
		System.out.println("expected: " + user4 + "actual: " + gamertagDisplay4.getText() );
		}
		if (!user5.equals(gamertagDisplay5.getText())) {
		result = false;
		System.out.println("expected: " + user5 + "actual: " + gamertagDisplay5.getText() );
		}

		return result;
		}
	
	public void searchUser(String theUser) {
		searchInput.sendKeys(theUser);
		searchInput.submit();
	}
	
	public boolean checkGames() {
		boolean result = true;
		//read the expected Games from property file
		Properties PROPERTIES_RESOURCES = SystemUtil
		.loadPropertiesResources("/testdata_XboxUserGamesTest.properties");
		String game1 = PROPERTIES_RESOURCES.getProperty("game1");
		String game2 = PROPERTIES_RESOURCES.getProperty("game2");
		String game3 = PROPERTIES_RESOURCES.getProperty("game3");
		String game4 = PROPERTIES_RESOURCES.getProperty("game4");
		String game5 = PROPERTIES_RESOURCES.getProperty("game5");

		if (!game1.equals(actualGame1.getText())) {
		result = false;
		System.out.println("expected: " + game1 + " actual: " + actualGame1.getText() );
		}
		if (!game2.equals(actualGame2.getText())) {
		result = false;
		System.out.println("expected: " + game2 + " actual: " + actualGame2.getText() );
		}
		if (!game3.equals(actualGame3.getText())) {
		result = false;
		System.out.println("expected: " + game3 + " actual: " + actualGame3.getText() );
		}
		if (!game4.equals(actualGame4.getText())) {
		result = false;
		System.out.println("expected: " + game4 + " actual: " + actualGame4.getText() );
		}
		if (!game5.equals(actualGame5.getText())) {
		result = false;
		System.out.println("expected: " + game5 + " actual: " + actualGame5.getText() );
		}



		return result;
		}

}

