package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchBar {
    public SearchBar clickSearch() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        return this;
    }

    public SearchBar sendSearch(String searchText) {
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                .sendKeys(searchText);
        return this;
    }

    public SearchBar checkSearch() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchBar openArticle() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
        return this;
    }
}
