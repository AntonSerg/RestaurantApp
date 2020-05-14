/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDrinks;

import RestFood.RestDrinks.DrinkType.*;

/**
 *
 * @author Anton
 */
public enum DrinkList {
    espresso("Espresso", 2, DrinkType.coffee), 
    latte("Latte", 5, DrinkType.coffee),
    tea("Tea", 3, DrinkType.tea),
    juice("Juice", 4, DrinkType.juice);
    
    String name;
    double price;
    DrinkType drinkType;
    private DrinkList(String name, double price, DrinkType drinkType)
    {
        this.name = name;
        this.price = price;
        this.drinkType = drinkType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
    
}
