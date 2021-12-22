package HomeTask;

public enum Ingredients {

    SAUCE(10, "1"),
    CHEESE(20, "2"),
    CUTLET(30, "3");

    int price;
    String code;

    Ingredients(int price, String code) {
        this.price = price;
        this.code = code;
    }


}
