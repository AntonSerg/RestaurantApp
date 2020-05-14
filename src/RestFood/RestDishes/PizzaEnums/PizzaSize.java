/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.PizzaEnums;

/**
 *
 * @author Anton
 */
public enum PizzaSize {
    Small("Small", 7), Medium("Medium",10), Big("Big", 12);
    
    String type;
    double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString()
    {
        return getType();
    }
    
    private PizzaSize(String type, double price)
    {
        this.type = type;
        this.price = price;
    }
}
