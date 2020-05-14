/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDrinks;

import Product.Product;
import RestFood.RestDrinks.DrinkType.*;

/**
 *
 * @author Anton
 */
public abstract class Drinks extends Product {
    protected DrinkType drinkType;
    protected DrinkSize drinkSize;
    
    public abstract DrinkType getDrinkType();
    public abstract DrinkSize getDrinkSize();
    public abstract double calcPrice(double mainPrice);
}
