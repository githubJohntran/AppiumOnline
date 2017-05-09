package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class basics extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath
		/*xpath syntax
		 * //tagnam[@attribute='value']
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	}

}
