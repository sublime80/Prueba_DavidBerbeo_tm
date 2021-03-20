package starter.ui;

import org.openqa.selenium.By;

public class SearchForm {

    public static By SEARCH_FIELD = By.id("twotabsearchtextbox");
    public static By SEARCH_BUTTON = By.id("nav-search-submit-button");
    public static By SEARCH_BRAND = By.xpath("//li[@id='p_89/Motorola']/span[@class='a-list-item']/a");
    public static By SEARCH_LAST_PRODUCT = By.xpath("//*[@data-component-type='s-search-result'][last()]//h2/a");
    public static By LIST_ADD_BUTTON = By.id("wishListMainButton");
    public static By USER_FIELD = By.id("ap_email");
    public static By CONTINUE_USER_LOGIN_BUTTON = By.id("continue");
    public static By PASSWORD_FIELD = By.id("ap_password");
    public static By LOGIN_BUTTON = By.id("auth-signin-button");




}
