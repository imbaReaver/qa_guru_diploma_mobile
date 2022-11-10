package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ArticlePage {

    public ArticlePage checkImage() {
        $(AppiumBy.id("org.wikipedia.alpha:id/view_page_header_image")).shouldBe(visible);
        return this;
    }
}
