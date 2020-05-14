/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDrinks.DrinkType;

/**
 *
 * @author Anton
 */
public enum DrinkSize {
    small("Small", 4), medium("Medium", 5), big("Big", 7);
    
    String size;
    double price;

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
    private DrinkSize(String size, double price)
    {
        this.size = size;
        this.price = price;
    }
}
