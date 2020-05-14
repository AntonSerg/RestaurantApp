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
public enum DrinkType {
    coffee("Coffee", 5), tea("Tea", 1), juice("Juice", 3);
    
    String typeName;
    double price;

    public double getPrice() {
        return price;
    }

    public String getType() {
        return typeName;
    }
    private DrinkType(String type, double price)
    {
        this.typeName = type;
        this.price = price;
    }
}
