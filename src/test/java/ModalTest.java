import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("LyaylyaMiftakhova")
@Feature("Модалка создания/редактирования маршрута")

public class ModalTest {

    @Test
    @DisplayName("Поиск")
    public void checkSearchTest() {
        step("Поиск осуществляется по городам", () -> {
        });
        step("Поиск осуществляется по ПВЗ", () -> {
        });
    }

    @Test
    @DisplayName("Проверка чек-бокса города")
    public void checkCheckboxCityTest() {
        step("Чек-бокс невыбранного города белый и активный", () -> {
        });
        step("Чек-бокс города, ПВЗ которого выбраны частично, красный "
                + "с белой горизонтальной полоской", () -> {
        });
        step("При нажатии на неактивный чек-бокс города ничего не происходит", () -> {
        });
        step("При нажатии на чек-бокс с белой полоской происходит 'довыбор "
                + "всех не выбранных ПВЗ со всеми типами доставки", () -> {
        });
        step("При нажатии на чек-бокс с белой галочкой происходит отмена "
                + "выбора всех ПВЗ со всеми типами доставки", () -> {
        });
        step("При нажатии на полностью белый чек-бокс происходит "
                + "выбор всех ПВЗ города со всеми типами доставки", () -> {
        });
    }

    @Test
    @DisplayName("Проверка чек-боксов")
    public void checkCheckboxTest() {
        step("При нажатии на неактивный чек-бокс ПВЗ ничего не происходит", () -> {
        });
        step("При нажатии на неактивный чек-бокс стены упаковки ничего не происходит", () -> {
        });
        step("При нажатии на активный чек-бокс стены упаковки чек-бокс становится "
                + "красного цвета с белой галочкой внутри.", () -> {
        });
    }

    @Test
    @DisplayName("Блок ПВЗ")
    public void checkPvzBlockTest() {
        step("При нажатии на знак вопроса в блоке с ПВЗ появляется текстовая подсказка", () -> {
        });
        step("В блоке с ПВЗ для уже привязанных к маршрутам ПВЗ в чек-боксах выводятся "
                + "цифры - номера маршрутов, к которым они привязаны", () -> {
        });
    }

    @Test
    @DisplayName("Модальное окно создания/редактирования маршрута")
    public void checkModalTest() {
        step("При нажатии на город в правой части блока появляется список ПВЗ этого города", () -> {
        });
        step("При нажатии на область вне модалки появляется предупреждение "
                + "о том, что изменения не будут сохранены", () -> {
        });
        step("При нажатии на крестик появляется предупреждение о том, что изменения не будут сохранены", () -> {
        });
        step("Если в модалке нажать 'да', изменения не сохранятся", () -> {
        });
        step("Если в модалке нажать нет' - модалка останется открытой", () -> {
        });
        step("Кнопка 'Сохранить' сохраняет все примененные изменения", () -> {
        });
    }
}



