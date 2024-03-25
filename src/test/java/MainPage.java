import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
//Главная страница сайта
    private static final String MainPageURL = "https://www.wildberries.ru/";
    private final SelenideElement input = $x("//input[@class=\"search-catalog__input j-wba-header-item\"]");


    public void OpenMainPage(){
        Selenide.open(MainPageURL);
        //открываем нужную страницу в браузере
    }

    public void clicInputMainPage() {
        input.click();
        //нажимаем на элемент на странице
    }
}


