import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {

    //Метод отвечает за установку и инициализацию браузера
 public void setUp(){
     //втоматически скачиваем хромдрайвер, указываем путь и устанавливаем базовые настройки
     WebDriverManager.chromedriver().setup();
     //Говорим какой браузер нужен
     Configuration.browser = "chrome";
     //Указываем что у нас есть библиотека WebDriverManager
     Configuration.webdriverLogsEnabled = true;
     //Указываем размеры окна браузера
     Configuration.browserSize = "1920*1080";
     //Указываем хотим ли мы видеть сам тест (обычно это нужно для дженкинса тк дженкинс - сервер)
     Configuration.headless = true;
 }
//Методы которые будут вызываться перед каждым тестом обозначаются Before
    @Before
    public void init(){
     setUp();
    }
//Методы которые будут вызываться После каждого теста обозначаются After
    @After
    public void tearDown(){
     //Метод закрывает браузер
        Selenide.closeWebDriver();
    }

}
