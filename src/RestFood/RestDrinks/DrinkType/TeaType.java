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
public enum TeaType {
    green("Green", 3), black("Black",2), white("White", 5), fruit("Fruit", 4);
    
    String type;
    double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    private TeaType(String type, double price)
    {
        this.type = type;
        this.price = price;
    }
}
