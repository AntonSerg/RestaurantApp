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
public class Tea extends Drinks{
    TeaType teaType;
    
    public Tea(String name, double price, TeaType tea)
    {
        super.name = name;
        super.drinkSize = DrinkSize.medium;
        super.drinkType = DrinkType.tea;
        this.teaType = tea;
        super.price = calcPrice(price);
        super.describe = createDescribe();
    }
    
    public String createDescribe()
    {
        String desc =
                "Name: " + this.getName() + "   Type: " + drinkType.getType()+ "\n"
                + "Size: " + drinkSize.getSize() + "    Price: " + drinkSize.getPrice() + "$\n"
                + "Tea: " + teaType.getType() + "   Price: " + teaType.getPrice() + "$\n"
                + "Total Price: " + this.getPrice() + "$\n";
        return desc;
    }
    
    @Override
    public double calcPrice(double mainPrice)
    {
        mainPrice += drinkSize.getPrice() + drinkType.getPrice();
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
