import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
snipped page: C:\Users\esuarezg\AppData\Roaming\Code\User\snippets\java.json
*/
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
