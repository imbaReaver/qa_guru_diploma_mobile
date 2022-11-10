package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@DisplayName("Wikipedia android app tests")
public class AndroidTests extends TestBase {

    @Test
    @Tag("Mobile")
    @Owner("imbaReaver")
    @Feature("Search")
    @DisplayName("Wikipedia search test")
    void searchTest() {

        step("Skip onboarding", () ->
                onboardingPage.skipOnboarding()
        );

        step("Type search", () -> {
            searchBar.clickSearch();
            searchBar.sendSearch("BrowserStack");
        });

        step("Verify search content found", () ->
                searchBar.checkSearch()
        );
    }

    @Test
    @Tag("Mobile")
    @Owner("imbaReaver")
    @Feature("Search")
    @DisplayName("Open article test")
    void openArticleTest() {

        step("Skip onboarding", () ->
                onboardingPage.skipOnboarding());

        step("Type search", () -> {
            searchBar.clickSearch();
            searchBar.sendSearch("Gradle");
        });

        step("Verify search content found", () ->
                searchBar.checkSearch()
        );

        step("Open article", () ->
                searchBar.openArticle()
        );

        step("Check image in article", () ->
                articlePage.checkImage()
        );
    }

    @Test
    @Tag("Mobile")
    @Owner("imbaReaver")
    @Feature("Onboarding")
    @DisplayName("Wikipedia onboarding screen test")
    void onboardingScreenTest() {

        step("Check texts on first screen", () ->
                onboardingPage.checkFirstScreenTexts()
        );

        step("Click on 'continue' button", () ->
                onboardingPage.continueClick()
        );

        step("Check texts on second screen", () ->
                onboardingPage.checkSecondScreenTexts()
        );

        step("Click on 'continue' button", () ->
                onboardingPage.continueClick()
        );

        step("Check texts on third screen", () ->
                onboardingPage.checkThirdScreenTexts()
        );

        step("Click on 'continue' button", () ->
                onboardingPage.continueClick()
        );

        step("Check texts on fourth screen", () ->
                onboardingPage.checkFourthScreenTexts()
        );
    }
}
