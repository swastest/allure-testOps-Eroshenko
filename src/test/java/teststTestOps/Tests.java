package teststTestOps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class Tests {

    @Test
    @AllureId("10857")
    @DisplayName("Авторизация")
    @Owner("allure8")
    void test01() {
        step("Открыть главную страницу", () -> {
            step("Нажать на кнопку Личный Кабинет");
        });
        step("Нажать на кнопку Личный кабинет");
        step("Заполнить поле Логин");
        step("Заполнить поле Пароль");
        step("Нажать на кнопку Войти");
        step("Разлогиниться");
    }

    @Test
    @DisplayName("Авторизация через гугл")
    void test02() {
        step("Открыть главную страницу", () -> {
            step("Нажать на кнопку Войти через Гугл аккаунт");
        });
        step("Ввести данные гугл почты 'random@gmail.com'");
        step("Нажать на кнопку Войти");
        step("Разлогиниться");
    }


    /*
    @Test
    @AllureId("10860")
    @DisplayName("Тест-кейс из Идеи")
    void test02() {
        step("Открыть главную страницу Гитхаб", () ->
                open("https://github.com/"));
        step("В строке поиска ввести запрос 'Selenide'", () ->
                $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter());
        step("Выбрать из спика", () -> {
            $$("ul.repo-list li").first().$("[href]").click();
            $("#wiki-tab").click();
            $("div#wiki-body h1").shouldHave(text("Welcome to the selenide wiki!"));
            $(".Box-row button").click();
            $$("#wiki-pages-box li").find(Condition.text("SoftAssertions")).click();
        });

        step("Проверить", () -> {
            $(".gh-header").shouldHave(text("SoftAssertions"));
            $$(".markdown-body h4").shouldHave(itemWithText("3. Using JUnit5 extend test class:"));
        });


    }*/
}
