package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		//setup the file to hold the testing app
		File f =new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		//appium code
		//Declare Desired Capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		//set Capability for your emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "demo");
		//set Capability for your testing app
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//connect to server. (wd=web driver)
		AndroidDriver  driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
