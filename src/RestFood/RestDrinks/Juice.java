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
public class Juice extends Drinks {
    JuiceType juiceType;
    
    public Juice(String name, double price, JuiceType juiceType)
    {
        super.name = name;
        super.drinkSize = drinkSize.medium;
        super.drinkType = DrinkType.juice;
        this.juiceType = juiceType;
        super.price = calcPrice(price);
        super.describe = createDescribe();
        
    }
    public String createDescribe()
    {
        String desc =
                "Name: " + this.getName() + "   Type: " + drinkType.getType()+ "\n"
                + "Size: " + drinkSize.getSize() + "    Price: " + drinkSize.getPrice() + "$\n"
                + "Juice: " + juiceType.getType() + "   Price: " + juiceType.getPrice() + "$\n"
                + "Total Price: " + this.getPrice() + "$\n";
        return desc;
    }
    @Override
    public double calcPrice(double mainPrice)
    {
        mainPrice += drinkSize.getPrice() + drinkType.getPrice() + juiceType.getPrice();
        return mainPrice;
    }
    
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getDescribe() {
        return super.describe;
    }

    @Override
    public DrinkType getDrinkType() {
        return super.drinkType;
    }

    @Override
    public DrinkSize getDrinkSize() {
        return super.drinkSize;
    }
    
    @Override 
    public String toString()
    {
    return this.getName() + "   " + this.getPrice() + "$";
    }
}
