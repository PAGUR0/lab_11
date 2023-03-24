package com.company;

interface product{
    String getName();
    void setName(String name);
    double getPrice();
    void setPrice(double price);
    int getRating();
    void setRating(int rating);
}

interface user{
    String getLogin();
    void setLogin(String login);
    String getPassword();
    void setPassword(String password);
}

public class Main {

    public static void main(String[] args) {
	    product Apple = new product_fruits("Яблоко", 26.4, 5);
        product Potato = new product_vegetable("Картофель", 20.3, 5);
        product Strawberry = new product_berries("Клубника", 30.6, 4);
        user Ivan = new user_admin("Ivan_ad", "23nsu543");
        user Shop = new user_shop("Shop", "ki93821ks");
        user Oleg = new user_buyer("Oleg", "213ssd23");
        purchase purchase_1 = new purchase(Apple.getName(), Apple.getPrice(), Apple.getRating(), Oleg.getLogin(), Oleg.getPassword());
        purchase_1.printPurchase();
    }
}
