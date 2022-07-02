package teststTestOps;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class Tests {

    @Test
    @Owner("allure8")
    @AllureId("10857")
    @DisplayName("Авторизация")
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
    @AllureId("10861")
    @DisplayName("Авторизация через гугл")
    void test02() {
        step("Открыть главную страницу", () -> {
            step("Нажать на кнопку Войти через Гугл аккаунт");
        });
        step("Ввести данные гугл почты 'random@gmail.com'");
        step("Нажать на кнопку Войти");
        step("Разлогиниться");
    }

}
