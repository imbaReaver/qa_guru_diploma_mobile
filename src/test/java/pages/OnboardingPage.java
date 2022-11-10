package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OnboardingPage {

    public OnboardingPage skipOnboarding() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        return this;
    }

    public OnboardingPage continueClick() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        return this;
    }

    public OnboardingPage checkFirstScreenTexts() {
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia " +
                "…in over 300 languages"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("We’ve found the " +
                "following on your device:"));
        return this;
    }

    public OnboardingPage checkSecondScreenTexts() {
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Dive down the " +
                "Wikipedia rabbit hole"));
        return this;
    }

    public OnboardingPage checkThirdScreenTexts() {
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists " +
                "with sync"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Join Wikipedia"));
        return this;
    }

    public OnboardingPage checkFourthScreenTexts() {
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Help make " +
                "the app better"));
        return this;
    }
}
