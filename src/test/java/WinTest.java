import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.sf.jni4net.Bridge;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class WinTest {

    @Test
    public void bindDll() throws Exception {
        File libsDir = new File("jni4net/lib");
        Bridge.setVerbose(true);
        Bridge.init(libsDir);
        Bridge.setVerbose(true);
        Bridge.LoadAndRegisterAssemblyFrom(new File(libsDir, "FlaUI.Bridge.dll"));
    }

    @Test
    public void chromedriverTest() throws Exception {
        ChromeDriverManager.chromedriver().setup();
        new ChromeDriver().get("http://google.com");
    }
}
