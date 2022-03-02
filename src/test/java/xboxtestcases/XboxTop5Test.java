package xboxtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import xboxbasepages.XboxLeaderboardPage;
import util.TestCaseBase;

public class XboxTop5Test extends TestCaseBase {
	
	@Test(groups={"ChromeWin32"})
	public void testTop5() throws Exception 
	{	
		XboxLeaderboardPage xboxTop5 = new XboxLeaderboardPage();
		xboxTop5.open();
		Assert.assertTrue(xboxTop5.getGamerTags());
	}
	

}
