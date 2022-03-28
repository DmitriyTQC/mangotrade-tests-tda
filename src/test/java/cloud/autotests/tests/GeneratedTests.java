package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Login test 1")
    @DisplayName("Success login to account")
    void succesLogin() {
        step("Open 'https://trade.mangotrade.com/en/login'", () -> {
            step("// todo: just add selenium action", () -> {
                open("https://trade.mangotrade.com/en/login");
            });
        });

        step("Set email 'mnn'", () -> {
            step("// todo: just add selenium action", () -> {
                // $("[data-test-id=login-email-input]").setValue("mnenie@bk.ru");
                $("[name=identifier]").setValue("mnenie@bk.ru");
            });
        });

        step("Set password 'Test123'", () -> {
            step("// todo: just add selenium action", () -> {
                //$("[data-test-id=login-password-input]").setValue("Test1234");
                $("[name=password]").setValue("Test1234");
            });
        });

        step("Click button \"Log in\"", () -> {
            step("// todo: just add selenium action", () -> {
                $("[data-test-id=login-submit-button]").click();
                sleep(5000);
            });
        });

        step("Redirect to 'https://trade.mangotrade.com/traderoom'", () -> {
            step("// todo: just add selenium action", () -> {
                String currURL = getWebDriver().getCurrentUrl();
                assertEquals("https://trade.mangotrade.com/traderoom", currURL);
            });
        });
    }

    @Test
    @Description("Login test 2")
    @DisplayName("Failed login with null data")
    void failedLoginBothFieldsNull() {
        step("Open 'https://trade.mangotrade.com/en/login'", () -> {
                open("https://trade.mangotrade.com/en/login");
        });


        step("Click button \"Log in\"", () -> {
                $("[data-test-id=login-submit-button]").click();
        });

        step("Expected Results", () -> {
            step("Error message below field 'Email'", () -> {
                $("[name=identifier]").$(".iqInput__error.active").$("span").shouldHave(text("Fill out the field"));
            });
            step("Error message below field 'Password'", () -> {
                $("[name=password]").$(".iqInput__error.active").$("span").shouldHave(text("Fill out the field"));
            });
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://trade.mangotrade.com/en/login'", () ->
                open("https://trade.mangotrade.com/en/login"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}