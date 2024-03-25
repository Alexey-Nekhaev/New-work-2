import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

//extends BaseTest - наследум методы класса BaseTest
 public class MainPageTest extends BaseTest{
    // создаем финальную переменную
    private  static  final String NameComputer = "macbook air m1";

@Test
    public void CheckProductSearch (){
    //Создаем экземпляр класс MainPage что бы использовать его методы
    MainPage mainPage = new MainPage();
    mainPage.OpenMainPage();
    int f = 12;
}


}
