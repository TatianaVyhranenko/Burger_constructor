package HomeTask;

import java.util.ArrayList;

public class Burger {

    private int price;

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    private ArrayList<Ingredients> additionalIngredients = new ArrayList<>();

    public ArrayList<Ingredients> getAdditionalIngredients() {
        return additionalIngredients;
    }

    public void setAdditionalIngredients(Ingredients additionalIngredients) {
        this.additionalIngredients.add(additionalIngredients);
    }

    public Burger(int newPrice) {
        this.price = newPrice;
    }

    public void addIngredients(Ingredients newIngredient) {
        setAdditionalIngredients(newIngredient);
        int updatedPrice = this.price + newIngredient.price;
        setPrice(updatedPrice);
    }
}
