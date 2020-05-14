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
public class Meat extends Ingredients {
    MeatType type;
    public Meat(String name)
    {
        super.name = name;
        super.price = 8;
        type = MeatType.other;
        typeIng = ingType.Meat;
    }
    public Meat(String name, double price)
    {
        this(name);
        super.price = price;
    }
    public Meat(String name, double price, MeatType mType)
    {
        this(name, price);
        type = mType;
    }

    public MeatType getType() {
        return type;
    }
    @Override
    public String getName() {
        if(super.name.length() == 0){
            setPrice(0);
            return "Default";
        }else{
            return super.name;
        }
    }

    @Override
    public double getPrice() {
        if(super.name.length() == 0){
            setName("Default");
            return 0;
        }else{
            return super.price;
        }
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
