/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.RestIngredients;

/**
 *
 * @author Anton
 */
public abstract class Ingredients {
    protected String name;
    protected double price;
    protected ingType typeIng;

    public ingType getIngType() {
        return typeIng;
    }

    public abstract String getName();
    public abstract double getPrice();
    public abstract void setName(String name);
    public abstract void setPrice(double price);
    
}
