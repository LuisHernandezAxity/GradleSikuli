import com.sun.tools.javac.Main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Selenium {
    private static final Pattern rutaBusquedaGoogle = new Pattern(Main.class.getClassLoader().getResource("rutaBusquedaGoogle.png"));
    private static final Pattern imagenaConvertir = new Pattern(Main.class.getClassLoader().getResource("imagenaConvertir.png"));
    private static final Pattern btnAbrir = new Pattern(Main.class.getClassLoader().getResource("btnAbrir.png"));

    public static void main(String[] args) throws InterruptedException, FindFailed {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ilovepdf.com/es/jpg_a_pdf");

        driver.manage().window().maximize();

        Screen screen=new Screen();

        Pattern btnSeleccionar = new Pattern("C:\\Users\\lsanabria\\Desktop\\Oxxo\\ProjectTest\\src\\Images\\btnSeleccionar.png");
        screen.click(btnSeleccionar);
        screen.click(rutaBusquedaGoogle);
        screen.type("C:\\Users\\lsanabria\\Desktop\\Oxxo");
        screen.type(Key.ENTER);
        screen.click(imagenaConvertir);
        screen.click(btnAbrir);



    }
}


