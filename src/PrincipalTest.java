import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrincipalTest {

	  private AndroidDriver driver;
	  private WebDriverWait webDriver;


	  @Before
	  public void setUp() throws MalformedURLException {
		
	  }

	  @Test
	  public void sampleTest() {
	}

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}
