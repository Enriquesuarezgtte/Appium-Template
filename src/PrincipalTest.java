import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrincipalTest extends Capabilities {

	  private AndroidDriver<AndroidElement> driver;

	  @Before
	  public void setUp() throws MalformedURLException {
		driver = capabilities();
	  }

	  @Test
	  public void sampleTest() {
	}

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}
