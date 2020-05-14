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
public enum PizzaDough {
    Coarse("Coarse", 3), Thin("Thin",0);
    
    String type;
    double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    private PizzaDough(String type, double price)
    {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return getType();
    }

};
